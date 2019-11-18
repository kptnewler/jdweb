package com.newler.jdweb.dao;

import com.newler.jdweb.DO.OrderGoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsDao {
    int addOrderGoods(List<OrderGoodsDO> orderGoodsDO);

    int deleteByOrderId(long orderId);

    int deleteByGoodsId(long goodsId);

    int deleteByOrderIdAndGoodsId(@Param("orderId") long orderId, @Param("goodsId") long goodsId);

    int updateByOrderId(@Param("orderId") long orderId, @Param("goodsId") long goodsId);
}
