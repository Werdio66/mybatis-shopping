package com._520.shopping.mapper;

import com._520.shopping.domain.Brand;

public interface BrandMapper {

    /**
     *  增加商品类型
     * @param brand     要添加的商品类型
     */
    void save(Brand brand);


    /**
     *  删除商品类型
     * @param id    删除商品的id
     */
    void delete(Long id);
}
