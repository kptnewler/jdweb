package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.data.pojo.OrderGoods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderGoodsDaoTest {
    @Autowired
    private OrderGoodsDao orderGoodsDao;

    @Test
    public void addOrderGoods() {
        OrderGoods orderGoods = new OrderGoods();
        orderGoods.setGoodsId(100002019841L);
        orderGoods.setOrderId(105717213931L);
        orderGoods.setNum(1);
        int num = orderGoodsDao.addOrderGoods(orderGoods);
        Assert.assertEquals(1, num);
    }

    @Test
    public void deleteByOrderId() {

    }

    @Test
    public void deleteByGoodsId() {

    }

    @Test
    public void deleteOrderGoods() {
        int num  = orderGoodsDao.deleteOrderGoods(105717213931L, 100002019841L);
        Assert.assertEquals(1, num);
    }
}
