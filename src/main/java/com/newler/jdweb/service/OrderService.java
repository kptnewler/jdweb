package com.newler.jdweb.service;

import com.newler.jdweb.dto.OrderInfo;
import com.newler.jdweb.pojo.Order;

import java.util.List;

public interface OrderService {
    List<OrderInfo> getOrderList();
}
