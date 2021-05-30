package com.jinshipark.cms.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JinshiparkDaysum implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "日期")
    private Date date;

    @ApiModelProperty(value = "付费车辆数")
    private String carsum;

    @ApiModelProperty(value = "应收停车费")
    private String parkfee;

    @ApiModelProperty(value = "实收停车费")
    private String realparkfee;

    @ApiModelProperty(value = "预付费用金额")
    private String prepaymoney;

    @ApiModelProperty(value = "扫码付费金额")
    private String scanpaymoney;

    @ApiModelProperty(value = "人工收费金额")
    private String manualmoney;

    @ApiModelProperty(value = "预付和扫码支付的手续费；一般是千分之六")
    private String servicefee;

    @ApiModelProperty(value = "退费")
    private String returnmoney;

    @ApiModelProperty(value = "退费手续费")
    private String refundservicefee;

    @ApiModelProperty(value = "车场ID")
    private String parkid;

    @ApiModelProperty(value = "备注")
    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCarsum() {
        return carsum;
    }

    public void setCarsum(String carsum) {
        this.carsum = carsum;
    }

    public String getParkfee() {
        return parkfee;
    }

    public void setParkfee(String parkfee) {
        this.parkfee = parkfee;
    }

    public String getRealparkfee() {
        return realparkfee;
    }

    public void setRealparkfee(String realparkfee) {
        this.realparkfee = realparkfee;
    }

    public String getPrepaymoney() {
        return prepaymoney;
    }

    public void setPrepaymoney(String prepaymoney) {
        this.prepaymoney = prepaymoney;
    }

    public String getScanpaymoney() {
        return scanpaymoney;
    }

    public void setScanpaymoney(String scanpaymoney) {
        this.scanpaymoney = scanpaymoney;
    }

    public String getManualmoney() {
        return manualmoney;
    }

    public void setManualmoney(String manualmoney) {
        this.manualmoney = manualmoney;
    }

    public String getServicefee() {
        return servicefee;
    }

    public void setServicefee(String servicefee) {
        this.servicefee = servicefee;
    }

    public String getReturnmoney() {
        return returnmoney;
    }

    public void setReturnmoney(String returnmoney) {
        this.returnmoney = returnmoney;
    }

    public String getRefundservicefee() {
        return refundservicefee;
    }

    public void setRefundservicefee(String refundservicefee) {
        this.refundservicefee = refundservicefee;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", carsum=").append(carsum);
        sb.append(", parkfee=").append(parkfee);
        sb.append(", realparkfee=").append(realparkfee);
        sb.append(", prepaymoney=").append(prepaymoney);
        sb.append(", scanpaymoney=").append(scanpaymoney);
        sb.append(", manualmoney=").append(manualmoney);
        sb.append(", servicefee=").append(servicefee);
        sb.append(", returnmoney=").append(returnmoney);
        sb.append(", refundservicefee=").append(refundservicefee);
        sb.append(", parkid=").append(parkid);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}