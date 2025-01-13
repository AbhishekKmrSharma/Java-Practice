package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.models.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployee
{
	@Autowired
	private DataSource ds;
	private String sql1 = "select * from t3";
	@Override
	public List<Employee> getStudents() 
	{
		List<Employee> list = new ArrayList<Employee>();
		try 
		{
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(sql1);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				list.add(e);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return list;
	}

}
