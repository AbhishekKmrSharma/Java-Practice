package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate temp;
	private String sql = "insert into student values(?,?,?)";
	
	@Override
	public void insert(Student std) 
	{
		int i = temp.update(sql, std.getId(),std.getName(),std.getGender());
		System.out.println(i);
	}
	
}
