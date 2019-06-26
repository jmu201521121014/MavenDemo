package com.javen.MavenDemo.bean;

public class Student {
    private String stuId;

    private String stuPass;

    private String stuEmail;

    private String stuName;

    private String stuSex;

    private String stuPhone;
    

    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stuId, String stuPass, String stuEmail, String stuName, String stuSex, String stuPhone) {
		super();
		this.stuId = stuId;
		this.stuPass = stuPass;
		this.stuEmail = stuEmail;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuPhone = stuPhone;
	}

	public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass == null ? null : stuPass.trim();
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }
}