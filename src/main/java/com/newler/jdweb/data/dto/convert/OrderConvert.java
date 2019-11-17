package com.newler.jdweb.data.dto.convert;

import com.newler.jdweb.data.dto.OrderResult;
import com.newler.jdweb.data.dojo.Order;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderConvert {
    public static OrderResult convert(Order order) {
        OrderResult orderResult = new OrderResult();
        orderResult.setCarriageId(order.getCarriageId());
        orderResult.setId(order.getId());
        orderResult.setPayWay(order.getPayWay());
        orderResult.setPrice(order.getPrice());
        orderResult.setRegistration(order.getRegistration());
        orderResult.setStatus(order.getStatus());
        orderResult.setSettlementPrice(order.getSettlementPrice());
        orderResult.setUid(order.getUid());
        orderResult.setPlatform(order.getPlatform());
        String receiverIverInfo = new StringBuilder("收件人:").append(order.getReceiverName()).append("\n")
                .append("收件号码").append(order.getReceiverPhone()).append("\n")
                .append("收件地址").append(order.getReceiverAddress()).append("\n").toString();

        orderResult.setReceiverInfo(receiverIverInfo);

        StringBuilder goodsInfoStringBuilder = new StringBuilder("");
        AtomicInteger goodsNum = new AtomicInteger();
        order.getGoodsInfos().forEach(goodsInfo -> {
            goodsInfoStringBuilder.append(goodsInfo.getName()).append("\n");
            goodsNum.addAndGet(goodsInfo.getGoodsNum());
        });
        orderResult.setGoodsInfo(goodsInfoStringBuilder.toString());
        orderResult.setGoodsNum(goodsNum.get());

        return orderResult;
    }
}
