package com.javen.MavenDemo.bean;

import java.util.Date;

public class Examine extends ExamineKey {
    private Date examTime;

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }
}