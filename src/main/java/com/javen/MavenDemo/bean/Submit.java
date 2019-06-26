package com.javen.MavenDemo.bean;

public class Submit extends SubmitKey {
    private String stuAnswer;

    private Integer subScore;

    public String getStuAnswer() {
        return stuAnswer;
    }

    public void setStuAnswer(String stuAnswer) {
        this.stuAnswer = stuAnswer == null ? null : stuAnswer.trim();
    }

    public Integer getSubScore() {
        return subScore;
    }

    public void setSubScore(Integer subScore) {
        this.subScore = subScore;
    }
}