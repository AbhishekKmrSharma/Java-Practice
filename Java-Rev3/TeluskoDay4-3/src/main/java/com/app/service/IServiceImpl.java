package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@Service
public class IServiceImpl implements IService
{
	@Autowired
	private EmployeeDao dao;

	@Override
	public void insert(Employee emp) 
	{
		dao.save(emp);
	}

	@Override
	public void deleteEmp(int id) 
	{
		dao.deleteById(id);
	}
	
}
