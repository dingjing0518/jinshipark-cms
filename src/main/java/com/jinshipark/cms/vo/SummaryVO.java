package com.jinshipark.cms.vo;

public class SummaryVO {
    private String date;
    private String carNum;
    private String parkingCost;
    private String realCost;
    private String refundMoney;
    private String parkId;
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCarNum() {
        return carNum == null ? "0" : carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getParkingCost() {
        return parkingCost == null ? "0.0" : parkingCost;
    }

    public void setParkingCost(String parkingCost) {
        this.parkingCost = parkingCost;
    }

    public String getRealCost() {
        return realCost == null ? "0.0" : realCost;
    }

    public void setRealCost(String realCost) {
        this.realCost = realCost;
    }

    public String getRefundMoney() {
        return refundMoney == null ? "0.0" : refundMoney;
    }

    public void setRefundMoney(String refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }
}
