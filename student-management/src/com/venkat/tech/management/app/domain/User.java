package com.venkat.tech.management.app.domain;

public class User {
	private String username;
	private String password;
	private String name;
	private String type;
	private Address address;
	private String phone;
	private String email;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	 
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", name=" + name + ", type=" + type + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + "]";
	}

}
