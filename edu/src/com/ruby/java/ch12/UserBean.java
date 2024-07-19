package com.ruby.java.ch12;

import java.io.Serializable;

public class UserBean implements Serializable{
	private String id;
	private String name;
	private String tel;
	private String address;
	


	public UserBean() {
	
	}
	
	public UserBean(String id , String name, String tel, String address) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
		}

	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getTel() {
		return tel;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "UserBean [id ="+ id + ", name = "+ name + ", tel = " + tel +", address = "+ address +"]";
	}
	
	}
