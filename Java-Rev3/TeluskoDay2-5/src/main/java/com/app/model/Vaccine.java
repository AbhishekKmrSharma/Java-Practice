package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine 
{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int vId;
	private String vName;
	private String vCompany;
	private double vCost;
	
	public Vaccine()
	{
		super();
	}
	
	public Vaccine(String vName, String vCompany, double vCost) {
		super();
		this.vName = vName;
		this.vCompany = vCompany;
		this.vCost = vCost;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvCompany() {
		return vCompany;
	}

	public void setvCompany(String vCompany) {
		this.vCompany = vCompany;
	}

	public double getvCost() {
		return vCost;
	}

	public void setvCost(double vCost) {
		this.vCost = vCost;
	}

	@Override
	public String toString() {
		return "Vaccine [vId=" + vId + ", vName=" + vName + ", vCompany=" + vCompany + ", vCost=" + vCost + "]";
	}
	
	
}
