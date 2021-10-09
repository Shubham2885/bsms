package com.bridglabz.bookstoremangementsystem.entity;

public class User {
	String id;
	String name;
	String mobile;
	String email;
	String address;
	
	public User() {
	}
	
	public User(String ID, String Name, String mob, String Email, String addr) {
		id = ID;
		name = Name;
		mobile = mob;
		email = Email;
		address = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address=" + address
				+ "]";
	}
}
