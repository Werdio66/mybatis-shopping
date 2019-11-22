package com._520.shopping.query;

import java.util.List;

public class PageResult {

    private List<?> listDates;              // 存储查询对象结果集
    private Integer totalCount;             // 一共多少条数局

    private Integer courentPage = 1;        // 当前页
    private Integer pageSize = 3;           // 每页多少条数据

    private Integer beginPage = 1;          // 首页
    private Integer prevPage;               // 上一页
    private Integer nextPage;               // 下一页
    private Integer totalPage;              // 尾页


    public PageResult(List<?> listDates, Integer totalCount, Integer courentPage, Integer pageSize) {
        this.listDates = listDates;
        this.totalCount = totalCount;
        this.courentPage = courentPage;
        this.pageSize = pageSize;

        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        this.nextPage = courentPage + 1 < totalPage ? courentPage + 1 : totalPage;
        this.prevPage = courentPage - 1 > 1 ? courentPage - 1 : beginPage;
        this.courentPage = courentPage > totalPage ? totalPage : courentPage;
    }

    public List<?> getListDates() {
        return listDates;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public Integer getCourentPage() {
        return courentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getBeginPage() {
        return beginPage;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }
}
