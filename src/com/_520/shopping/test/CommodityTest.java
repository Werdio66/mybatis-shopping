package com._520.shopping.test;

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
    @Test
    void query(){
        SqlSession session = MybatisUtil.getSession();

        CommodityMapper mapper = session.getMapper(CommodityMapper.class);

        CommodityQueryObject qo = new CommodityQueryObject();
//        qo.setKeyword("");
//        qo.setMinPrice(100D);
        qo.setBrandName("其他");

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
}
