package com.app.service;

import java.util.List;

import com.app.views.EmployeeRecordsView;


public interface IService 
{
	public List<EmployeeRecordsView> fetchDetailsBySalary(int amount);
}
