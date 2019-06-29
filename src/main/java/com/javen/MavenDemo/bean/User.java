package com.javen.MavenDemo.bean;

import java.io.Serializable;

public class User implements Serializable{
    private Integer userId;

    private String userPas;

    private String role;

    private String userName;

    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userPas, String role, String userName) {
		super();
		this.userId = userId;
		this.userPas = userPas;
		this.role = role;
		this.userName = userName;
	}

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