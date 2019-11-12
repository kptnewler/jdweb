package com.newler.jdweb.dao;

import com.newler.jdweb.pojo.Order;
import org.springframework.stereotype.Component;

import java.util.List;

public interface OrderDao {
    List<Order> getOrderList();
}
