package com.newler.jdweb.dao;

import com.newler.jdweb.DO.OrderGoodsDO;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsDao {
    int addOrderGoods(OrderGoodsDO orderGoodsDO);

    int deleteByOrderId(long orderId);

    int deleteByGoodsId(long goodsId);

    int deleteOrderGoods(@Param("orderId") long orderId, @Param("goodsId") long goodsId);

    int updateOrderGoods(@Param("orderId") long orderId, @Param("goodsId") long goodsId);
}
