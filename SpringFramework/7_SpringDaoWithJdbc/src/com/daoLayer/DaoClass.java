package com.daoLayer;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Student;

public class DaoClass implements DaoInt
{
	JdbcTemplate jdtemp;
	
	public void setJdtemp(JdbcTemplate jdtemp) 
	{
		this.jdtemp = jdtemp;
	}

	@Override
	public boolean insert(Student std) 
	{
		boolean status = false;
		String insertQ = "insert into register values(?,?,?,?,?)";
		int count = jdtemp.update(insertQ, new Object[] {std.getName(),std.getEmail(),std.getPassword(),std.getGender(),std.getAge()});
		if(count > 0)
		{
			status = true;
		}
		return status;
	}
}
