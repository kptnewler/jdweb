package com.newler.jdweb.service;

import com.newler.jdweb.dto.OrderInfo;
import com.newler.jdweb.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;
public interface OrderService {
    List<OrderInfo> getOrderList();

    long addOrders(OrderInfo orderInfo);
}
