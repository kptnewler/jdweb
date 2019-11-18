package com.newler.jdweb.dto.convert;

import com.newler.jdweb.DO.OrderInfoDo;
import com.newler.jdweb.dto.OrderItemDTO;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderConvert {
    public static OrderItemDTO convert(OrderInfoDo order) {
        OrderItemDTO orderInfoExcel = new OrderItemDTO();
        orderInfoExcel.setCarriageId(order.getCarriageId());
        orderInfoExcel.setId(order.getId());
        orderInfoExcel.setPayWay(order.getPayWay());
        orderInfoExcel.setPrice(order.getPrice());
        orderInfoExcel.setRegistration(order.getRegistration());
        orderInfoExcel.setStatus(order.getStatus());
        orderInfoExcel.setSettlementPrice(order.getSettlementPrice());
        orderInfoExcel.setUid(order.getUid());
        orderInfoExcel.setPlatform(order.getPlatform());
        String receiverIverInfo = new StringBuilder("收件人:").append(order.getReceiverName()).append("\n")
                .append("收件号码").append(order.getReceiverPhone()).append("\n")
                .append("收件地址").append(order.getReceiverAddress()).append("\n").toString();

        orderInfoExcel.setReceiverInfo(receiverIverInfo);
        StringBuilder goodsInfoStringBuilder = new StringBuilder("");
        AtomicInteger goodsNum = new AtomicInteger();
        order.getGoodsInfos().forEach(goodsInfo -> {
            goodsInfoStringBuilder.append(goodsInfo.getName()).append("\n");
            goodsNum.addAndGet(goodsInfo.getNum());
        });
        orderInfoExcel.setGoodsInfo(goodsInfoStringBuilder.toString());
        orderInfoExcel.setGoodsNum(goodsNum.get());

        return orderInfoExcel;
    }
}
