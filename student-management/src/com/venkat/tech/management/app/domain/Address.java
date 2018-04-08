package com.venkat.tech.management.app.domain;

public class Address {
	private String lin1;
	private String line2;
	private String landmark;
	private int pincode;
	private String country;
	private String state;
	public String getLin1() {
		return lin1;
	}
	public String getLine2() {
		return line2;
	}
	public String getLandmark() {
		return landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public void setLin1(String lin1) {
		this.lin1 = lin1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [lin1=" + lin1 + ", line2=" + line2 + ", landmark="
				+ landmark + ", pincode=" + pincode + ", country=" + country
				+ ", state=" + state + "]";
	}
	
}
