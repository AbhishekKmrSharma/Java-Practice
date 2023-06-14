package com.demo;

public class Maruti implements CarTypes
{
	String carname;
	
	Maruti()
	{
		System.out.println("Default");
	}
	Maruti(String carname)
	{
		this.carname=carname;
	}
	
	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
		System.out.println("Car name is: "+carname);
	}

	public String toString() {
		return "I am Maruti Baleno";
	}
}
