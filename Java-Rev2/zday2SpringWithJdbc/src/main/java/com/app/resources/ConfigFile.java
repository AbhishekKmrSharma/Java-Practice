package com.app.resources;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigFile 
{
	@Bean
	public DriverManagerDataSource sqlConnection()
	{
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/db2024");
		dm.setUsername("root");
		dm.setPassword("abhi@123");
		return dm;
	}
	
	@Bean
	public JdbcTemplate jTemplate()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(sqlConnection());
		return jt;
	}
	
}
