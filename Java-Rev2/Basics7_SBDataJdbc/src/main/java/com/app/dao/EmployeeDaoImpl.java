package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.models.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao
{
	@Autowired
	private JdbcTemplate jTemp;
	String query = "INSERT into t3 values(?,?,?)";
	
	@Override
	public int insert() 
	{		
		Employee e = new Employee(5,"Kaushik",32145);
		int i = jTemp.update(query, e.getId(),e.getName(),e.getSalary());
		return i;
	}
}
