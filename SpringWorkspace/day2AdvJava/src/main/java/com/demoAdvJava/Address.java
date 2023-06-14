package com.demoAdvJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	@Value("Punjab")
	String state;
	@Value("Pathankot")
	String city;
	@Value("27")
	int age;
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", age=" + age + "]";
	}
}
