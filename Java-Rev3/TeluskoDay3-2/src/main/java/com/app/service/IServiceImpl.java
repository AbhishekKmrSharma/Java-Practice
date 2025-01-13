package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.models.Employee;

@Service
public class IServiceImpl implements IService
{
	@Autowired
	private IEmployeeDao dao;

	@Override
	public List<Employee> getEmpDetails() 
	{
		return dao.getEmployeeDetailsAll();
	}

	@Override
	public List<Employee> getBySalary(int salary) 
	{
		return dao.getDetailsBySalary(salary);
	}

	@Override
	public List<String> getEmpSalaryBetween(int min, int max) 
	{
		return dao.getEmp(min, max);
	}

	@Override
	public void updateSalary(int salary, String name) 
	{
		dao.updateSalary(salary, name);
	}

	@Override
	public int deleteEmpById(int id) 
	{
		return dao.delEmpById(id);
	}
	
	
}
