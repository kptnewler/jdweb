package com.newler.jdweb.dao;

import com.newler.jdweb.pojo.GoodsInfo;

import java.util.List;

public interface GoodsDao {
    int addGoods(GoodsInfo goodsInfo);

    int deleteGoodsById(long id);

    int updateGoodsById(long id);

    List<GoodsInfo> getGoodsInfoListByPlatform(String platform);

    GoodsInfo getGoodsInfoById(String id);

    List<GoodsInfo> getGooidInfoListByName(String name);
}
