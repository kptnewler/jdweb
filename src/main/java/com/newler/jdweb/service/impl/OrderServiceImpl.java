package com.newler.jdweb.service.impl;

import com.newler.jdweb.poi.OrderExcelItem;
import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.dao.OrderGoodsDao;
import com.newler.jdweb.dto.SearchOrder;
import com.newler.jdweb.DO.OrderInfoDo;
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
    public List<OrderExcelItem> getOrderListBySearchParams(SearchOrder searchOrder) {
        List<OrderInfoDo> orders = orderDao.getOrderListBySearchParams(searchOrder);

        return null;
    }

    /**
     * 根据订单ID搜索
     */
    @Override
    public OrderExcelItem getOrderListByOrderId(long orderId) {
        OrderInfoDo order = orderDao.getOrderListByOrderId(orderId);
        return  null;
    }

    /**
     * 1.添加订单
     * 2.将订单和商品的映射关系保存到订单商品表中
     */
    @Override
    public int addOrder(OrderInfoDo order) {
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
    public int updateOrder(OrderInfoDo order) {
        return 0;
    }

    /**
     * 更新订单商品
     */
    public int updateOrderGoods(long orderId, long goodsId){
        return 0;
    }
}
