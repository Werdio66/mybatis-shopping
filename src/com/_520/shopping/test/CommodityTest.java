package com._520.shopping.test;

import com._520.shopping.mapper.CommodityMapper;
import com._520.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class CommodityTest {

    @Test
    void query(){
        SqlSession session = MybatisUtil.getSession();

        CommodityMapper mapper = session.getMapper(CommodityMapper.class);
        mapper.query().forEach(System.out::println);

    }
}
