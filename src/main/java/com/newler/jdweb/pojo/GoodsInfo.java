package com.newler.jdweb.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1573549362489L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String price;

    /**
    * 
    * isNullAble:1
    */
    private String goodsUrl;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPrice(String price){this.price = price;}

    public String getPrice(){return this.price;}

    public void setGoodsUrl(String goodsUrl){this.goodsUrl = goodsUrl;}

    public String getGoodsUrl(){return this.goodsUrl;}


    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", goodsUrl='" + goodsUrl + '\'' +
                '}';
    }
}
