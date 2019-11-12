package com.newler.jdweb.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Order implements Serializable {
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
    private String carriageId;

    /**
     *
     * isNullAble:1
     */
    private String carriageUrl;

    /**
     *
     * isNullAble:1
     */
    private String carrier;

    /**
     *
     * isNullAble:1
     */
    private Date date;

    /**
     *
     * isNullAble:1
     */
    private Float price;

    /**
     *
     * isNullAble:1
     */
    private String receiverAddress;

    /**
     *
     * isNullAble:1
     */
    private String receiverName;

    /**
     *
     * isNullAble:1
     */
    private String receiverPhone;

    /**
     *
     * isNullAble:1
     */
    private String orderUrl;

    /**
     *
     * isNullAble:1
     */
    private String status;

    /**
     *
     * isNullAble:1,defaultVal:0
     */
    private float settlementPrice;

    /**
     *
     * isNullAble:1
     */
    private String uid;

    private String payWay;

    private List<GoodsInfo> goodsInfos;

    /**
     *
     * isNullAble:1,defaultVal:0
     */
    private boolean registration;

    public float getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(float settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public boolean isRegistration() {
        return registration;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarriageId() {
        return carriageId;
    }

    public void setCarriageId(String carriageId) {
        this.carriageId = carriageId;
    }

    public String getCarriageUrl() {
        return carriageUrl;
    }

    public void setCarriageUrl(String carriageUrl) {
        this.carriageUrl = carriageUrl;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getCompleted() {
        return settlementPrice;
    }

    public void setCompleted(float completed) {
        this.settlementPrice = completed;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean getRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", carriageId='" + carriageId + '\'' +
                ", carriageUrl='" + carriageUrl + '\'' +
                ", carrier='" + carrier + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", orderUrl='" + orderUrl + '\'' +
                ", status='" + status + '\'' +
                ", settlementPrice=" + settlementPrice +
                ", uid='" + uid + '\'' +
                ", payWay='" + payWay + '\'' +
                ", goodsInfos=" + goodsInfos +
                ", registration=" + registration +
                '}';
    }
}
