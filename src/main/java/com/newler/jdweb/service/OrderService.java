package com.newler.jdweb.service;

import com.newler.jdweb.dto.OrderItemDTO;
import com.newler.jdweb.dto.SearchOrderParams;
import com.newler.jdweb.DO.OrderInfoDo;

import java.util.List;
public interface OrderService {
    /**
     * 订单查询，返回订单列表，部分信息，null显示全部
     */
    List<OrderItemDTO> getOrderListBySearchParams(SearchOrderParams searchOrder);

    /**
     * 返回订单详情,通过订单ID
     */
    OrderInfoDo getOrderDetail(long orderId);

    /**
     * 添加订单
     */
    boolean addOrder(OrderInfoDo order);

    /**
     * 删除订单
     */
    boolean deleteOrder(long orderId);

    /**
     * 修改订单信息
     */
    boolean updateOrder(OrderInfoDo order);

    /**
     * 修改订单商品
     */
    boolean updateOrderGoods(long orderId, long goodsId);
}
