package com.newler.jdweb.dao;

import com.newler.jdweb.data.dto.OrderResult;
import com.newler.jdweb.data.dto.SearchOrder;
import com.newler.jdweb.data.dojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    Order getOrderListByOrderId(long orderId);

    List<Order> getOrderListBySearchParams(@Param("searchOrder") SearchOrder searchOrder);

    int addOrder(Order order);

    int deleteOrder(long orderId);

    int updateOrder(OrderResult orderResult);

}
