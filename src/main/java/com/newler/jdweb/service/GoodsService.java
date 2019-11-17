package com.newler.jdweb.service;

import com.newler.jdweb.data.pojo.GoodsInfo;

public interface GoodsService {
    int addGoods(GoodsInfo goodsInfo);

    int deleteGoods(long goodsId);
}
