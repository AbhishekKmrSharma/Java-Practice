package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.beans.T2;

public class T2Mapper implements RowMapper<T2>
{
	@Override
	public T2 mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		T2 t = new T2();
		t.setId(rs.getInt(1));
		t.setName(rs.getString(2));
		t.setSalary(rs.getString(3));
		return t;
	}
}
