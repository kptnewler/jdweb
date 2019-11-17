package com.newler.jdweb.data.dto;

import java.sql.Date;

public class SearchOrder {
    private String receiveName;
    private String receiveAddr;
    private Date startDate;
    private Date endDate;
    private String goodsName;
    private String platform;

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
}
