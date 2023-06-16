package com.first;

public class FirstDemo 
{
	private String name;
	private int accBal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccBal() {
		return accBal;
	}
	
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "Name: "+name+"\n"+"Account Balance: "+accBal;
	}
	
	
}
