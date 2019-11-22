package com._520.shopping.query;

/**
 * 商品高级查询
 */
public class CommodityQueryObject extends QueryObject {

    private String keyword;             // 关键字
    private Double minPrice;            // 最低价格
    private Double maxPrice;            // 最高价格
    private String brandName;           // 商品分类


    public String getKeyword() {
        if (isEmpty(keyword))
            return null;
        else
            return keyword;
    }
    public String getBrandName() {
        if (isEmpty(brandName))
            return null;
        else
            return brandName;
    }


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
