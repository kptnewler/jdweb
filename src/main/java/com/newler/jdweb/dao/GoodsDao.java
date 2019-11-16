package com.newler.jdweb.dao;

import com.newler.jdweb.pojo.GoodsInfo;

import java.util.List;

public interface GoodsDao {
    int addGoods(GoodsInfo goodsInfo);

    int deleteGoodsById(long id);

    int updateGoodsById(GoodsInfo goodsInfo);

    List<GoodsInfo> getGoodsInfoListByPlatform(String platform);

    GoodsInfo getGoodsInfoById(long id);

    List<GoodsInfo> getGooidInfoListByName(String name);
}
