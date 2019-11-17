package com.newler.jdweb.DO;

import java.io.Serializable;

/**
*
*  订单商品类
*/
public class OrderGoodsDO extends GoodsInfoDO implements Serializable {

    private static final long serialVersionUID = 1573549390559L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long orderId;

    /**
    * 
    * isNullAble:1
    */
    private Integer num;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrderGoodsDO{" +
                "orderId=" + orderId +
                ", num=" + num +
                '}';
    }
}
