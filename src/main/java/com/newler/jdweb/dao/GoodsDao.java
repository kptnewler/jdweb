package com.newler.jdweb.dao;

import com.newler.jdweb.DO.GoodsInfoDO;

import java.util.List;

public interface GoodsDao {
    int addGoods(GoodsInfoDO goodsInfoDO);

    int deleteGoodsById(long id);

    int updateGoodsById(GoodsInfoDO goodsInfoDO);

    List<GoodsInfoDO> getGoodsInfoListByPlatform(String platform);

    GoodsInfoDO getGoodsInfoById(long id);

    List<GoodsInfoDO> getGooidInfoListByName(String name);
}
