package com.javen.MavenDemo.bean;

public class Student {
    private Integer stuId;

    private String stuPass;

    private String stuEmail;

    private String stuName;

    private String stuSex;

    private String stuPhone;

    private Integer userId;
    

    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String stuPass, String stuEmail, String stuName, String stuSex, String stuPhone,
			Integer userId) {
		super();
		this.stuId = stuId;
		this.stuPass = stuPass;
		this.stuEmail = stuEmail;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuPhone = stuPhone;
		this.userId = userId;
	}

	public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}