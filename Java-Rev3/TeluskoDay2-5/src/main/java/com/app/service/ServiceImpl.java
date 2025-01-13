package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Vaccine;
import com.app.repo.VaccineRepo;

@Service
public class ServiceImpl implements Iservice
{
	@Autowired
	private VaccineRepo vaccineRepo;
	
	@Override
	public String addVaccine(Vaccine vaccine) 
	{
		vaccineRepo.save(vaccine);
		return "Added";
	}

	@Override
	public Iterable<Vaccine> addMultiVaccine(Iterable<Vaccine> vaccine) 
	{
		return vaccineRepo.saveAll(vaccine);
	}

	@Override
	public long vCount() 
	{
		return vaccineRepo.count();
	}

	@Override
	public boolean vExist(int vId) 
	{
		return vaccineRepo.existsById(vId);
	}

	@Override
	public Iterable<Vaccine> allVaccine() 
	{
		return vaccineRepo.findAll();
	}

	@Override
	public Vaccine checkAvailability(Integer id) 
	{
		Optional<Vaccine> opt = vaccineRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			return new Vaccine();
	}

	@Override
	public String deleteVaccine(Integer vId) 
	{	
		Optional<Vaccine> opt = vaccineRepo.findById(vId);
		if(opt.isPresent())
		{
			vaccineRepo.deleteById(vId);
			return "Deleted "+vId;
		}
		else
			return "ID Doesn't Exist";
	}

	@Override
	public Vaccine findVbyName(String vName) 
	{
		return vaccineRepo.findByVName(vName);
	}
}
