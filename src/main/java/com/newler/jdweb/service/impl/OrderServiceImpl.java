package com.newler.jdweb.service.impl;

import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.dao.OrderGoodsDao;
import com.newler.jdweb.data.dto.OrderResult;
import com.newler.jdweb.data.dto.SearchOrder;
import com.newler.jdweb.data.dto.convert.OrderConvert;
import com.newler.jdweb.data.dojo.Order;
import com.newler.jdweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderGoodsDao orderGoodsDao;

    /**
     * 根据复合查询条件，搜索
     */
    @Override
    public List<OrderResult> getOrderListBySearchParams(SearchOrder searchOrder) {
        List<Order> orders = orderDao.getOrderListBySearchParams(searchOrder);
        List<OrderResult> orderResults = new ArrayList<>();
        orders.forEach(order -> {
            OrderResult orderResult = OrderConvert.convert(order);
            orderResults.add(orderResult);
        });
        return orderResults;
    }

    /**
     * 根据订单ID搜索
     */
    @Override
    public OrderResult getOrderListByOrderId(long orderId) {
        Order order = orderDao.getOrderListByOrderId(orderId);
        return OrderConvert.convert(order);
    }

    /**
     * 1.添加订单
     * 2.将订单和商品的映射关系保存到订单商品表中
     */
    @Override
    public int addOrder(Order order) {
        int orderNum = orderDao.addOrder(order);


        return 0;
    }

    /**
     * 删除订单
     * 删除订单商品表中包含订单id的item
     */
    @Override
    public int deleteOrder(long orderId) {
        return 0;
    }

    /**
     * 更新订单信息，不允许更改订单商品
     */
    @Override
    public int updateOrder(Order order) {
        return 0;
    }

    /**
     * 更新订单商品
     */
    public int updateOrderGoods(long orderId, long goodsId){
        return 0;
    }
}
