package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.bean.T3;

public class ResultMapper implements RowMapper<T3>
{

	@Override
	public T3 mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		T3 t = new T3();
		t.setId(rs.getInt(1));
		t.setName(rs.getString(2));
		t.setSalary(rs.getInt(3));
		return t;
	}

}
