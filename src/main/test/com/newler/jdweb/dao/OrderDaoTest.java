package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.data.dto.SearchOrder;
import com.newler.jdweb.data.dojo.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderDaoTest {
    @Autowired
    public OrderDao orderDao;

    @Test
    public void getOrderListByOrderId() {
        Order order = orderDao.getOrderListByOrderId(106050028743L);
        Assert.assertNotNull(order);
        Assert.assertNotNull(order.getGoodsInfos());
        Assert.assertEquals(order.getGoodsInfos().size(), 2);
    }

    @Test
    public void getOrderListBySearchParams() {
        SearchOrder searchOrder = null;
        List<Order> ordersAll = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersAll);
        Assert.assertTrue(ordersAll.size() > 10);

        searchOrder = new SearchOrder();
        searchOrder.setGoodsName("%Redmi Note7%");
        List<Order> ordersByGoodsName = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersByGoodsName);
        Assert.assertEquals(ordersByGoodsName.size(), 9);

        searchOrder = new SearchOrder();
        searchOrder.setPlatform("苏宁");
        List<Order> ordersByPlatform = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersByPlatform);
        Assert.assertEquals(ordersByPlatform.size(), 13);
    }

    @Test
    public void addOrder() {
    }

    @Test
    public void deleteOrder() {
    }

    @Test
    public void updateOrder() {
    }
}