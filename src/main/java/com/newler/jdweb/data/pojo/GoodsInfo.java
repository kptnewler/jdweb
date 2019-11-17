package com.newler.jdweb.data.pojo;

import java.io.Serializable;

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
    private float price;

    /**
    * 
    * isNullAble:1
    */
    private String goodsUrl;

    private String platform;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPrice(float price){this.price = price;}

    public float getPrice(){return this.price;}

    public void setGoodsUrl(String goodsUrl){this.goodsUrl = goodsUrl;}



    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", goodsUrl='" + goodsUrl + '\'' +
                '}';
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }
}
