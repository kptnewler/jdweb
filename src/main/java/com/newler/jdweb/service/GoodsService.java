package com.newler.jdweb.service;

import com.newler.jdweb.DO.GoodsInfoDO;

public interface GoodsService {
    int addGoods(GoodsInfoDO goodsInfoDO);

    int deleteGoods(long goodsId);
}
