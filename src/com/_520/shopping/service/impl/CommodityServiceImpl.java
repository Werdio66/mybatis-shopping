package com._520.shopping.service.impl;

import com._520.shopping.domain.Commodity;
import com._520.shopping.mapper.CommodityMapper;
import com._520.shopping.query.PageResult;
import com._520.shopping.query.QueryObject;
import com._520.shopping.service.ICommodityService;
import com._520.shopping.util.MybatisUtil;

import java.util.Collections;
import java.util.List;

public class CommodityServiceImpl implements ICommodityService {

    private CommodityMapper commodityMapper = MybatisUtil.getMapper(CommodityMapper.class);
    @Override
    public PageResult query(QueryObject qo) {
        Integer count = commodityMapper.queryForCount(qo);

        if (count == 0)
            return new PageResult(Collections.EMPTY_LIST,0,1,qo.getPageSize());

        List<Commodity> commodities = commodityMapper.queryForList(qo);

        return new PageResult(commodities,count,qo.getCurentPage(),qo.getPageSize());
    }
}
