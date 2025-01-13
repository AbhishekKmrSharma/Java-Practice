package com.app.models;

import org.springframework.stereotype.Repository;

public class Products 
{
	private Integer pId;
	private String pName;
	private int pCost;
	private char pCat;
	
//	public Products()
//	{
//		
//	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpCost() {
		return pCost;
	}

	public void setpCost(int pCost) {
		this.pCost = pCost;
	}

	public char getpCat() {
		return pCat;
	}

	public void setpCat(char pCat) {
		this.pCat = pCat;
	}

	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", pCat=" + pCat + "]";
	}
	
	
	
	
}
