package com.app.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Address
{
	@Value("Pathankot")
	private String city;
	@Value("145001")
	private double pinCode;
	
	public Address()
	{
		System.out.println("Address obj created");
	}
	
	public Address(String city, double pinCode) 
	{
		super();
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPinCode() {
		return pinCode;
	}

	public void setPinCode(double pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
