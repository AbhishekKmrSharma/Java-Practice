package com.javabeansclasses;

public class Address
{
	private String city;
	private int pinCode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "City ="+city+"\n"+"PinCode = "+pinCode;
	}
	
	
}
