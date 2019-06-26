package com.javen.MavenDemo.bean;

public class ExamineKey {
    private String queNo;

    private String testNo;

    public String getQueNo() {
        return queNo;
    }

    public void setQueNo(String queNo) {
        this.queNo = queNo == null ? null : queNo.trim();
    }

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo == null ? null : testNo.trim();
    }
}