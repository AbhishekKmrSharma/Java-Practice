package com.example.demo.controllers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	int pid;
	String pname;
	int noOfUnits;
	int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getNoOfUnits() {
		return noOfUnits;
	}
	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", noOfUnits=" + noOfUnits + ", price=" + price + "]";
	}
	
}
