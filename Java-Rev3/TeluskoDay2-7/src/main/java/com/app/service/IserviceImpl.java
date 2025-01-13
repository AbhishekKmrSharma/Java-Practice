package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.views.EmployeeRecordsView;

@Service
public class IserviceImpl implements IService
{
	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public List<EmployeeRecordsView> fetchDetailsBySalary(int amount) 
	{
		return dao.findBySalaryLessThan(amount);
	}
}
