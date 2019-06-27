package com.javen.MavenDemo.bean;

public class Teacher {
    private Integer teaId;

    private String teaPass;

    private String teaEmail;

    private String teaName;

    private Integer userId;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaPass() {
        return teaPass;
    }

    public void setTeaPass(String teaPass) {
        this.teaPass = teaPass == null ? null : teaPass.trim();
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail == null ? null : teaEmail.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}