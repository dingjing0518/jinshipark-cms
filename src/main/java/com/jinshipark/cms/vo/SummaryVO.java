package com.jinshipark.cms.vo;

public class SummaryVO {
    private String carNum;
    private String parkingCost;
    private String realCost;
    private String refundMoney;

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
}
