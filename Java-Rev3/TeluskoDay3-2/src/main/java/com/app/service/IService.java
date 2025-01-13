package com.app.service;

import java.util.List;

import com.app.models.Employee;



public interface IService 
{
	public List<Employee> getEmpDetails();
	public List<Employee> getBySalary(int salary);
	public List<String> getEmpSalaryBetween(int min, int max);
	public void updateSalary(int salary, String name);
	public int deleteEmpById(int id);
}
