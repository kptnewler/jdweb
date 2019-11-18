package com.newler.jdweb.dto;

import java.sql.Date;

public class SearchOrderParams {
    private String receiveName;
    private String receiveAddr;
    private Date startDate;
    private Date endDate;
    private String goodsName;
    private String platform;
    private Float settlePrice;
    private Boolean registration;
    private String uid;

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platForm) {
        this.platform = platForm;
    }

    public Float getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(Float settlePrice) {
        this.settlePrice = settlePrice;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
