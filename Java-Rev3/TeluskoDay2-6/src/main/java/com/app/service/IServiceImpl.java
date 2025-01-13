package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.app.models.Vaccine;
import com.app.repo.IVaccineRepo;

@Service
public class IServiceImpl implements IService
{
	@Autowired
	private IVaccineRepo repo;
	
	@Override
	public Iterable<Vaccine> fetchDetails(Boolean status, String... properties) 
	{
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
		
	}

	@Override
	public List<Vaccine> fetchDetailsByPagination(int pageNumber, int pageSize, Boolean status, String... properties) 
	{
		PageRequest pr = PageRequest.of(pageNumber, pageSize, status?Direction.ASC:Direction.DESC, properties);
		Page<Vaccine> page = repo.findAll(pr);
		return page.getContent();
	}
	
}
