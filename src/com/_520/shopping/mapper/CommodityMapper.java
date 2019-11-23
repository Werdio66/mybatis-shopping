package com._520.shopping.mapper;

import com._520.shopping.domain.Commodity;
import com._520.shopping.query.QueryObject;
import java.util.List;

public interface CommodityMapper {

    /**
     *  查询结果集
     * @param qo    查询条件对象
     * @return      Commodity
     */
    List<Commodity> queryForList(QueryObject qo);

    /**
     *  查询结果总数
     * @param qo    查询条件
     * @return      结果总数
     */
    Integer queryForCount(QueryObject qo);

    /**
     *  添加商品
     * @param commodity     商品对象
     */
    void save(Commodity commodity);

    /**
     * 修改商品信息
     *
     * @param commodity 修改后的商品对象
     * @param id        要修改商品id
     */
    void update(Commodity commodity, Long id);

    /**
     *  删除商品
     * @param id    删除商品的id
     */
    void delete(Long id);

    /**
     *  查询指定id的商品
     * @param id        查询的id
     */
    Commodity get(Long id);

    /**
     *  查询所有的商品
     * @return      商品集合
     */
    List<Commodity> listAll();
}
