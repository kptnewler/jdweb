package com.newler.jdweb.service.impl;

import com.newler.jdweb.dao.OrderDao;
import com.newler.jdweb.dto.OrderInfo;
import com.newler.jdweb.pojo.Order;
import com.newler.jdweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderDao orderDao;

    @Override
    public List<OrderInfo> getOrderList() {
        List<Order> orders = orderDao.getOrderList();
        List<OrderInfo> orderInfos = new ArrayList<>();
        orders.forEach(order -> {
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setCarriageId(order.getCarriageId());
            orderInfo.setId(order.getId());
            orderInfo.setPayWay(order.getPayWay());
            orderInfo.setPrice(order.getPrice());
            orderInfo.setRegistration(order.getRegistration());
            orderInfo.setStatus(order.getStatus());
            orderInfo.setSettlementPrice(order.getSettlementPrice());
            orderInfo.setUid(order.getUid());
            orderInfo.setGoodsNum(order.getGoodsInfos().size());
            String receiverIverInfo = new StringBuilder("收件人:").append(order.getReceiverName()).append("\n")
                    .append("收件号码").append(order.getReceiverPhone()).append("\n")
                    .append("收件地址").append(order.getReceiverAddress()).append("\n").toString();

            orderInfo.setReceiverInfo(receiverIverInfo);

            StringBuilder goodsInfoStringBuilder = new StringBuilder("");
            order.getGoodsInfos().forEach(goodsInfo -> {
                goodsInfoStringBuilder.append(goodsInfo.getName()).append("\n");
            });
            orderInfo.setGoodsInfo(goodsInfoStringBuilder.toString());
            orderInfos.add(orderInfo);
        });
        return orderInfos;
    }
}
