package com._520.shopping.service;

import com._520.shopping.query.PageResult;
import com._520.shopping.query.QueryObject;

public interface ICommodityService {

    PageResult query(QueryObject qo);
}
