package com.jinshipark.cms.bo;

/**
 * 用户前端传过来的封装实体
 */
public class JinshiparkUserBO {

    private Integer id;

    private String loginName;

    private String password;

    private String parkId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    @Override
    public String toString() {
        return "JinshiparkUserBO{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", parkId='" + parkId + '\'' +
                '}';
    }
}
