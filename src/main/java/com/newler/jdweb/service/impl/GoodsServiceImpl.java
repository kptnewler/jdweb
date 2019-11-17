package com.newler.jdweb.service.impl;

import com.newler.jdweb.DO.GoodsInfoDO;
import com.newler.jdweb.dao.GoodsDao;
import com.newler.jdweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public int addGoods(GoodsInfoDO goodsInfoDO) {
        return goodsDao.addGoods(goodsInfoDO);
    }

    /**
     * 删除商品,商品关联和相关订单不处理
     */
    @Override
    public int deleteGoods(long goodsId) {
        return goodsDao.deleteGoodsById(goodsId);
    }
}
