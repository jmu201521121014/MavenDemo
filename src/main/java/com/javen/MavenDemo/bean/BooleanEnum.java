package com.javen.MavenDemo.bean;

public enum BooleanEnum {
	
	True0("��", Boolean.TRUE), 
	True1("Y", Boolean.TRUE), 
	True2("TRUE", Boolean.TRUE), 
	True3("1", Boolean.TRUE), 
	True4("YES", Boolean.TRUE), 
	True5("T", Boolean.TRUE), 
	False0("��", Boolean.FALSE),
	False1("N", Boolean.FALSE),
	False2("FALSE", Boolean.FALSE),
	False3("0", Boolean.FALSE),
	False4("NO", Boolean.FALSE),
	False5("F", Boolean.FALSE);
	
	private String name;
	private Boolean value;

	private BooleanEnum(String name, Boolean value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}
}
