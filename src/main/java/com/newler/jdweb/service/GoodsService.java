package com.newler.jdweb.service;

import com.newler.jdweb.DO.GoodsInfoDO;
import com.newler.jdweb.dto.SearchGoodParams;

import java.util.List;

public interface GoodsService {
    /**
     * 添加商品
     */
    int addGoods(GoodsInfoDO goodsInfoDO);

    /**
     * 删除商品
     */
    int deleteGoods(long goodsId);

    /**
     * 更新商品
     */
    int updateGoods(GoodsInfoDO goodsInfoDO);

    /**
     * 查询商品列表
     */
    List<GoodsInfoDO> getGoodsInfo(SearchGoodParams searchGoodParams);
}
