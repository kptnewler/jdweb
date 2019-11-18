package com.newler.jdweb.dao;

import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.dto.SearchOrderParams;
import com.newler.jdweb.DO.OrderInfoDo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;

/**
 * 订单dao测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderInfoDaoTest {
    @Autowired
    public OrderDao orderDao;

    @Test
    public void getOrderListByOrderId() {
        OrderInfoDo order = orderDao.getOrderDetailById(106050028743L);
        Assert.assertNotNull(order);
        Assert.assertNotNull(order.getGoodsInfos());
        Assert.assertEquals(order.getGoodsInfos().size(), 2);
    }

    @Test
    public void getOrderListBySearchParams() {
        SearchOrderParams searchOrder = null;
        List<OrderInfoDo> ordersAll = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersAll);

        searchOrder = new SearchOrderParams();
        searchOrder.setGoodsName("%Redmi Note7%");
        List<OrderInfoDo> ordersByGoodsName = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersByGoodsName);

        searchOrder = new SearchOrderParams();
        searchOrder.setPlatform("苏宁");
        List<OrderInfoDo> ordersByPlatform = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersByPlatform);

        searchOrder = new SearchOrderParams();
        searchOrder.setRegistration(true);
        List<OrderInfoDo> ordersByRegistration = orderDao.getOrderListBySearchParams(searchOrder);
        Assert.assertNotNull(ordersByRegistration);
    }

    @Test
    public void addOrder() {
        Date date = new Date(System.currentTimeMillis());
        OrderInfoDo orderInfo = new OrderInfoDo(
                100002019841L,
                "100002019841",
                "",
                "",
                date,
                12.0f,
                "广西省南宁市",
                "白鹿原",
                "13055537258",
                "",
                "已结算",
                12.0f,
                "李白的号",
                "在线支付",
                "京东",
                "未结算",
                null,
                false
        );
        int num = orderDao.addOrder(orderInfo);
        Assert.assertEquals(1, num);
    }

    @Test
    public void deleteOrder() {
        int num = orderDao.deleteOrder(100002019841L);
        Assert.assertEquals(1, num);
    }

    @Test
    public void updateOrder() {
    }
}