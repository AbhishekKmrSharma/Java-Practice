package com.app.configFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConfigFile 
{
	@Bean
	public DriverManagerDataSource connect()
	{
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost:3306/db2024");
		db.setUsername("root");
		db.setPassword("abhi@123");
		return db;
	}
	
	@Bean
	public JdbcTemplate jTemplate()
	{
		JdbcTemplate jTemp = new JdbcTemplate();
		jTemp.setDataSource(connect());
		return jTemp;
	}
}
