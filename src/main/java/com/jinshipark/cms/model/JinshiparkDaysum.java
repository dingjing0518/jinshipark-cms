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

    @ApiModelProperty(value = "退费")
    private String returnmoney;

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

    public String getReturnmoney() {
        return returnmoney;
    }

    public void setReturnmoney(String returnmoney) {
        this.returnmoney = returnmoney;
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
        sb.append(", returnmoney=").append(returnmoney);
        sb.append(", parkid=").append(parkid);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}