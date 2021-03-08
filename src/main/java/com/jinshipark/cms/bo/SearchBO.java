package com.jinshipark.cms.bo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SearchBO {
    private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer pageNum;
    private Integer pageSize;
    private String parkId;
    private String keyWord;
    private String startTime;
    private String endTime;
    private String lpOrderState;
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getDateForStartTime() throws ParseException {
        return format.parse(this.startTime);
    }

    public Date getDateForEndTime() throws ParseException {
        return format.parse(this.endTime);
    }

    public String getLpOrderState() {
        return lpOrderState;
    }

    public void setLpOrderState(String lpOrderState) {
        this.lpOrderState = lpOrderState;
    }
}
