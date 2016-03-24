package com.tgb.model;

public class CusUser {
	private int id;
	private String name;
	private int bsid;
	private int password;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBsid() {
		return bsid;
	}
	public int getPassword() {
		return password;
	}
	public void setBsid(int buid) {
		this.bsid = buid;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
