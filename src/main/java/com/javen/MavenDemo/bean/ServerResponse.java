package com.javen.MavenDemo.bean;

import java.io.Serializable;



public class ServerResponse implements Serializable{

	private boolean success;
	private String msg;
	private Object data;
	
	public ServerResponse() {
		super();
	}

	public ServerResponse(boolean success, String msg, Object data) {
		this.success = success;
		this.msg = msg;
		this.data = data;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
