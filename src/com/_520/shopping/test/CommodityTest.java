package com._520.shopping.test;

import com._520.shopping.domain.Brand;
import com._520.shopping.domain.Commodity;
import com._520.shopping.mapper.BrandMapper;
import com._520.shopping.mapper.CommodityMapper;
import com._520.shopping.query.CommodityQueryObject;
import com._520.shopping.query.PageResult;
import com._520.shopping.service.ICommodityService;
import com._520.shopping.service.impl.CommodityServiceImpl;
import com._520.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class CommodityTest {

    private ICommodityService commodityService = new CommodityServiceImpl();

    private SqlSession session = MybatisUtil.getSession();

    private CommodityMapper commodityMapper = session.getMapper(CommodityMapper.class);
    private BrandMapper brandMapper = session.getMapper(BrandMapper.class);
    @Test
    void save(){
        Brand brand = new Brand();
        brand.setName("化妆品");
        brandMapper.save(brand);
        Commodity commodity = new Commodity();
        commodity.setName("理肤泉");
        commodity.setPrice(99D);
        commodity.setBrand(brand);
        commodityMapper.save(commodity);
        session.commit();
    }

    @Test
    void get(){
        System.out.println(commodityMapper.get(3L));
        System.out.println(commodityMapper.get(3L).getBrand());
    }









    @Test
    void query(){
        SqlSession session = MybatisUtil.getSession();

        CommodityMapper mapper = session.getMapper(CommodityMapper.class);

        CommodityQueryObject qo = new CommodityQueryObject();
//        qo.setKeyword("");
        qo.setMinPrice(100D);
//        qo.setBrandName("其他");

        mapper.queryForList(qo).forEach(System.out::println);
//        mapper.queryForCount(qo);


    }

    @Test
    void queryPage(){

        CommodityQueryObject qo = new CommodityQueryObject();
//        qo.setKeyword("");
//        qo.setMinPrice(100D);
//        qo.setBrandName("其他");

        PageResult query = commodityService.query(qo);

        query.getListDates().forEach(System.out::println);
    }

    @Test
    void listAll(){

        commodityMapper.listAll().forEach(System.out::println);
    }

    @Test
    void update(){

        Commodity commodity = new Commodity();
        commodity.setName("娃哈哈");
        commodity.setPrice(3D);
        commodity.setBrand(commodityMapper.get(18L).getBrand());
        commodityMapper.update(commodity,18L);
        session.commit();
    }

}
