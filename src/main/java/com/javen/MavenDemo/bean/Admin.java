package com.javen.MavenDemo.bean;

public class Admin {
    private String admId;

    private String admPas;

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public String getAdmPas() {
        return admPas;
    }

    public void setAdmPas(String admPas) {
        this.admPas = admPas == null ? null : admPas.trim();
    }
}