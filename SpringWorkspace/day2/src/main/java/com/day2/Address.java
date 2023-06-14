package com.day2;

public class Address
{
	String state;
	String city;
	int pincode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
		
	}
	
	@Override
	public String toString() 
	{
		System.out.println("state : "+state);
		System.out.println("city : "+city);
		System.out.println("pin : "+pincode);
		return "";
	}
}
