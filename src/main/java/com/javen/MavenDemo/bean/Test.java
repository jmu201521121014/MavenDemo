package com.javen.MavenDemo.bean;

import java.util.Date;

public class Test {
    private String testNo;

    private String testName;

    private String testClass;

    private String testStatus;

    private Integer testNum;

    private Date testLimit;

    public String getTestNo() {
        return testNo;
    }

    public void setTestNo(String testNo) {
        this.testNo = testNo == null ? null : testNo.trim();
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public String getTestClass() {
        return testClass;
    }

    public void setTestClass(String testClass) {
        this.testClass = testClass == null ? null : testClass.trim();
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus == null ? null : testStatus.trim();
    }

    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    public Date getTestLimit() {
        return testLimit;
    }

    public void setTestLimit(Date testLimit) {
        this.testLimit = testLimit;
    }
}