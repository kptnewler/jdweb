package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.pojo.GoodsInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void addGoods() {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setId(123242141L);
        goodsInfo.setGoodsUrl("02165");
        goodsInfo.setName("1111");
        goodsInfo.setPlatform("苏宁");
        goodsInfo.setPrice(12);
        int num = goodsDao.addGoods(goodsInfo);
        Assert.assertEquals(1, num);
    }

    @Test
    public void deleteGoodsById() {
        int num = goodsDao.deleteGoodsById(123242141L);
        Assert.assertEquals(1, num);
    }

    @Test
    public void updateGoodsById() {

    }

    @Test
    public void getGoodsInfoListByPlatform() {

    }

    @Test
    public void getGoodsInfoById() {

    }

    @Test
    public void getGoodsInfoListByName() {

    }
}