package com.lq.model;

/**
 * 用户实体类
 * 2018年10月9日16:45:50
 */
public class UserInfo {

    private Integer userId;
    private String UserName;
    private String Password;
    private Integer Status;
    private Integer empId;

    public UserInfo() {
        super();
    }

    public UserInfo(Integer userId, String userName, String password, Integer status, Integer empId) {
        this.userId = userId;
        UserName = userName;
        Password = password;
        Status = status;
        this.empId = empId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Status=" + Status +
                ", empId=" + empId +
                '}';
    }
}
