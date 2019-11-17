package com.newler.jdweb.dao;

import com.newler.jdweb.poi.OrderExcelItem;
import com.newler.jdweb.dto.SearchOrder;
import com.newler.jdweb.DO.OrderInfoDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    OrderInfoDo getOrderListByOrderId(long orderId);

    List<OrderInfoDo> getOrderListBySearchParams(@Param("searchOrder") SearchOrder searchOrder);

    int addOrder(OrderInfoDo order);

    int deleteOrder(long orderId);

    int updateOrder(OrderExcelItem orderInfoExcel);

}
