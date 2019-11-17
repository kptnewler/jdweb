package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.DO.GoodsInfoDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void addGoods() {
        GoodsInfoDO goodsInfoDO = new GoodsInfoDO();
        goodsInfoDO.setId(123242141L);
        goodsInfoDO.setGoodsUrl("02165");
        goodsInfoDO.setName("1111");
        goodsInfoDO.setPlatform("苏宁");
        goodsInfoDO.setPrice(12);
        int num = goodsDao.addGoods(goodsInfoDO);
        Assert.assertEquals(1, num);
    }

    @Test
    public void deleteGoodsById() {
        int num = goodsDao.deleteGoodsById(123242141L);
        Assert.assertEquals(1, num);
    }

    @Test
    public void updateGoodsById() {
        GoodsInfoDO goodsInfoDO = new GoodsInfoDO();
        goodsInfoDO.setId(123242141L);
        goodsInfoDO.setGoodsUrl("02165");
        goodsInfoDO.setName("1111");
        goodsInfoDO.setPlatform("苏宁");
        goodsInfoDO.setPrice(1);
        int num = goodsDao.updateGoodsById(goodsInfoDO);
        Assert.assertEquals(1, num);
    }

    @Test
    public void getGoodsInfoListByPlatform() {
        List<GoodsInfoDO> goodsInfoDOS = goodsDao.getGoodsInfoListByPlatform("京东");
        Assert.assertNotNull(goodsInfoDOS);
    }

    @Test
    public void getGoodsInfoById() {
        GoodsInfoDO goodsInfoDO = goodsDao.getGoodsInfoById(1241849);
        Assert.assertNotNull(goodsInfoDO);
    }

    @Test
    public void getGoodsInfoListByName() {
        List<GoodsInfoDO> goodsInfoDOS = goodsDao.getGooidInfoListByName("%小米%");
        Assert.assertNotNull(goodsInfoDOS);
        Assert.assertEquals(goodsInfoDOS.size(), 8);
    }
}