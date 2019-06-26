package com.javen.MavenDemo.bean;

public class Question {
    private String queNo;

    private String queType;

    private Integer queScore;

    private String queDes;

    private String queAnswer;

    private String queA;

    private String queB;

    private String queC;

    private String queD;

    public String getQueNo() {
        return queNo;
    }

    public void setQueNo(String queNo) {
        this.queNo = queNo == null ? null : queNo.trim();
    }

    public String getQueType() {
        return queType;
    }

    public void setQueType(String queType) {
        this.queType = queType == null ? null : queType.trim();
    }

    public Integer getQueScore() {
        return queScore;
    }

    public void setQueScore(Integer queScore) {
        this.queScore = queScore;
    }

    public String getQueDes() {
        return queDes;
    }

    public void setQueDes(String queDes) {
        this.queDes = queDes == null ? null : queDes.trim();
    }

    public String getQueAnswer() {
        return queAnswer;
    }

    public void setQueAnswer(String queAnswer) {
        this.queAnswer = queAnswer == null ? null : queAnswer.trim();
    }

    public String getQueA() {
        return queA;
    }

    public void setQueA(String queA) {
        this.queA = queA == null ? null : queA.trim();
    }

    public String getQueB() {
        return queB;
    }

    public void setQueB(String queB) {
        this.queB = queB == null ? null : queB.trim();
    }

    public String getQueC() {
        return queC;
    }

    public void setQueC(String queC) {
        this.queC = queC == null ? null : queC.trim();
    }

    public String getQueD() {
        return queD;
    }

    public void setQueD(String queD) {
        this.queD = queD == null ? null : queD.trim();
    }
}