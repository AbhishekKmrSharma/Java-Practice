package com.app.resources;

public class Address 
{
	private String city;
	private int pinCode;
	
	public Address()
	{
		System.out.println("Address Obj created");
	}
	
	public Address(String city, int pinCode)
	{
		this.city = city;
		this.pinCode = pinCode;
	}

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
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
