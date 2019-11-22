package com._520.shopping.mapper;

import com._520.shopping.domain.Commodity;
import com._520.shopping.query.QueryObject;
import java.util.List;

public interface CommodityMapper {

    List<Commodity> queryForList(QueryObject qo);

    Integer queryForCount(QueryObject qo);
}
