package com.componentclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	@Value("Punjab")
	private String state;
	@Value("145001")
	private int pinCode;
	
	@Override
	public String toString() {
		return "State: "+state+"\n"+"Pincode: "+pinCode;
	}
	
	
}
