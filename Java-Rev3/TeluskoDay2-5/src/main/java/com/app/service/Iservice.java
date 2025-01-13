package com.app.service;

import com.app.model.Vaccine;

public interface Iservice 
{
	public String addVaccine(Vaccine vaccine);
	public Iterable<Vaccine> addMultiVaccine(Iterable<Vaccine> vaccine);
	public long vCount();
	public boolean vExist(int vId);
	public Iterable<Vaccine> allVaccine();
	public Vaccine checkAvailability(Integer id);
	public String deleteVaccine(Integer vId);
	public Vaccine findVbyName(String vName);
}
