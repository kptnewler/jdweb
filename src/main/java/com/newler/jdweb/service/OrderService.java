package com.newler.jdweb.service;

import com.newler.jdweb.poi.OrderExcelItem;
import com.newler.jdweb.dto.SearchOrder;
import com.newler.jdweb.DO.OrderInfoDo;

import java.util.List;
public interface OrderService {
    List<OrderExcelItem> getOrderListBySearchParams(SearchOrder searchOrder);

    OrderExcelItem getOrderListByOrderId(long orderId);

    int addOrder(OrderInfoDo order);

    int deleteOrder(long orderId);

    int updateOrder(OrderInfoDo order);

    int updateOrderGoods(long orderId, long goodsId);
}
