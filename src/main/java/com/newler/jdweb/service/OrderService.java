package com.newler.jdweb.service;

import com.newler.jdweb.data.dto.OrderResult;
import com.newler.jdweb.data.dto.SearchOrder;
import com.newler.jdweb.data.dojo.Order;

import java.util.List;
public interface OrderService {
    List<OrderResult> getOrderListBySearchParams(SearchOrder searchOrder);

    OrderResult getOrderListByOrderId(long orderId);

    int addOrder(Order order);

    int deleteOrder(long orderId);

    int updateOrder(Order order);

    int updateOrderGoods(long orderId, long goodsId);
}
