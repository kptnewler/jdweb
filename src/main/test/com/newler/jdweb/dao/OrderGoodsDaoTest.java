package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.DO.OrderGoodsDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单商品dao测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderGoodsDaoTest {
    @Autowired
    private OrderGoodsDao orderGoodsDao;

    @Test
    public void addOrderGoods() {
        List<OrderGoodsDO> orderGoodsList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            OrderGoodsDO orderGoods = new OrderGoodsDO();
            orderGoods.setId(100002019841L+i);
            orderGoods.setOrderId(105717213931L+i);
            orderGoods.setNum(1);
            orderGoodsList.add(orderGoods);
        }
        int num = orderGoodsDao.addOrderGoods(orderGoodsList);
        Assert.assertEquals(2, num);
    }

    @Test
    public void deleteByOrderId() {

    }

    @Test
    public void deleteByGoodsId() {

    }

    @Test
    public void deleteOrderGoods() {
        int num  = orderGoodsDao.deleteByOrderIdAndGoodsId(105717213931L, 100002019841L);
        Assert.assertEquals(1, num);
    }
}
