package com.newler.jdweb.service.impl;

import com.newler.jdweb.dao.GoodsDao;
import com.newler.jdweb.pojo.GoodsInfo;
import com.newler.jdweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public long addGoods(GoodsInfo goodsInfo) {
        return goodsDao.addGoods(goodsInfo);
    }
}
