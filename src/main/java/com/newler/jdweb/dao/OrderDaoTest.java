package com.newler.jdweb.dao;


import com.newler.jdweb.config.SpringDaoConfig;
import com.newler.jdweb.config.SpringWebConfig;
import com.newler.jdweb.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.function.Consumer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDaoConfig.class, SpringWebConfig.class})
public class OrderDaoTest {
    @Autowired
    public OrderDao orderDao;

    @Test
    public void getOrderList() {
        orderDao.getOrderList().forEach(System.out::println);
    }
}