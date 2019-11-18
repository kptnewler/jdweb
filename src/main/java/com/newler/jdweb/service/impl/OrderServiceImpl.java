package com.newler.jdweb.service.impl;

import com.newler.jdweb.DO.OrderGoodsDO;
import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.dao.OrderGoodsDao;
import com.newler.jdweb.dto.OrderItemDTO;
import com.newler.jdweb.dto.SearchOrderParams;
import com.newler.jdweb.DO.OrderInfoDo;
import com.newler.jdweb.dto.convert.OrderConvert;
import com.newler.jdweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<OrderItemDTO> getOrderListBySearchParams(SearchOrderParams searchOrder) {
        List<OrderInfoDo> orderInfoDos =  orderDao.getOrderListBySearchParams(searchOrder);
        if (orderInfoDos != null) {
            return orderInfoDos.stream().map(OrderConvert::convert).collect(Collectors.toList());
        }
        return null;
    }

    /**
     * 根据ID返回订单详情
     */
    @Override
    public OrderInfoDo getOrderDetail(long orderId) {
        return orderDao.getOrderDetailById(orderId);
    }

    /**
     * 1.添加订单
     * 2.将订单和商品的映射关系保存到订单商品表中
     */
    @Override
    public boolean addOrder(OrderInfoDo order) {
        int orderNum = orderDao.addOrder(order);
        int orderGoodsNum = 0;
        List<OrderGoodsDO> orderGoodsList = order.getGoodsInfos();
        if (orderGoodsList != null && !orderGoodsList.isEmpty()) {
            orderGoodsNum = orderGoodsDao.addOrderGoods(order.getGoodsInfos());
        }

        return orderNum != 0 && orderGoodsNum != 0;
    }

    /**
     * 删除订单
     * 删除订单商品表中包含订单id的item
     */
    @Override
    public boolean deleteOrder(long orderId) {
        int orderNum = orderDao.deleteOrder(orderId);
        int orderGoodsNum = orderGoodsDao.deleteByOrderId(orderId);
        return orderNum != 0 && orderGoodsNum != 0;
    }

    /**
     * 更新订单信息，不允许更改订单商品
     */
    @Override
    public boolean updateOrder(OrderInfoDo order) {
        int num = orderDao.updateOrder(order);
        return num > 0;
    }

    /**
     * 更新订单商品
     */
    @Override
    public boolean updateOrderGoods(long orderId, long goodsId){
        OrderGoodsDO orderGoodsDO = new OrderGoodsDO();
        int num = orderGoodsDao.updateByOrderId(orderId, goodsId);
        return num > 0;
    }
}
