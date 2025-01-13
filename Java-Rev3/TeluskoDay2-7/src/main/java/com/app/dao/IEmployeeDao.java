package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Employee;
import com.app.views.EmployeeRecordsView;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>
{
	public List<EmployeeRecordsView> findBySalaryLessThan(int amount);
}
