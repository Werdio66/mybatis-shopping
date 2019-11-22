package com._520.shopping.query;

public class QueryObject {

    private Integer curentPage = 1;
    private Integer pageSize = 3;
    

    protected boolean isEmpty(String str){
        return  (str == null || str.trim().equals(""));
    }

    public Integer getBegin(){
        return (curentPage - 1) * pageSize;
    }

    public Integer getCurentPage() {
        return curentPage;
    }

    public void setCurentPage(Integer curentPage) {
        this.curentPage = curentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
