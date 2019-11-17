package com.newler.jdweb.data.pojo;

import java.io.Serializable;

/**
*
*  @author author
*/
public class OrderGoods implements Serializable {

    private static final long serialVersionUID = 1573549390559L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long orderId;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long goodsId;

    /**
    * 
    * isNullAble:1
    */
    private Integer num;


    public void setOrderId(Long orderId){this.orderId = orderId;}

    public Long getOrderId(){return this.orderId;}

    public void setGoodsId(Long goodsId){this.goodsId = goodsId;}

    public Long getGoodsId(){return this.goodsId;}

    public void setNum(Integer num){this.num = num;}

    public Integer getNum(){return this.num;}
    @Override
    public String toString() {
        return "ordergoods{" +
                "orderId='" + orderId + '\'' +
                "goodsId='" + goodsId + '\'' +
                "num='" + num + '\'' +
            '}';
    }
}
