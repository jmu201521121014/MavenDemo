package com.javen.MavenDemo.bean;

public class User {
    private Integer userId;

    private String userPas;

    private String role;

    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPas() {
        return userPas;
    }

    public void setUserPas(String userPas) {
        this.userPas = userPas == null ? null : userPas.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}