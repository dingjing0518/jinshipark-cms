package com.jinshipark.cms.vo;

import java.util.List;

public class SummaryVO {
    private String date;
    private String carNum;
    private String parkingCost;
    private String realCost;
    private String prePayMoney;//预付费用金额
    private String scanPayMoney;//扫码付费金额
    private String manualMoney;//人工收费金额
    private String refundMoney;//退款金额
    private String parkId;
    private String remarks;
    private String paymentType;
    private String serviceFee;
    private String refundServiceFee;//退费手续费

    List<SummaryVO> summaryVOList;

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

    public List<SummaryVO> getSummaryVOList() {
        return summaryVOList;
    }

    public void setSummaryVOList(List<SummaryVO> summaryVOList) {
        this.summaryVOList = summaryVOList;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getPrePayMoney() {
        return prePayMoney;
    }

    public void setPrePayMoney(String prePayMoney) {
        this.prePayMoney = prePayMoney;
    }

    public String getScanPayMoney() {
        return scanPayMoney;
    }

    public void setScanPayMoney(String scanPayMoney) {
        this.scanPayMoney = scanPayMoney;
    }

    public String getManualMoney() {
        return manualMoney;
    }

    public void setManualMoney(String manualMoney) {
        this.manualMoney = manualMoney;
    }

    public String getRefundServiceFee() {
        return refundServiceFee;
    }

    public void setRefundServiceFee(String refundServiceFee) {
        this.refundServiceFee = refundServiceFee;
    }
}
