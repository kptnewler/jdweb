package com.newler.jdweb.dao;

import com.newler.jdweb.dto.OrderItemDTO;
import com.newler.jdweb.dto.SearchOrderParams;
import com.newler.jdweb.DO.OrderInfoDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    OrderInfoDo getOrderDetailById(long orderId);

    List<OrderInfoDo> getOrderListBySearchParams(@Param("searchOrder") SearchOrderParams searchOrder);

    int addOrder(OrderInfoDo order);

    int deleteOrder(long orderId);

    int updateOrder(OrderInfoDo orderInfoDo);

}
