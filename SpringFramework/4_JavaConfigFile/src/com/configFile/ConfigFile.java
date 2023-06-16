package com.configFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beanClasses.*;

@Configuration
public class ConfigFile 
{
	@Bean
	public Employee emp()
	{
		Employee e = new Employee();
		e.setName("Abhishek Kumar");
		e.setAge(27);
		e.setAddress(addr());
		return e;
	}
	
	@Bean
	public Address addr()
	{
		Address add = new Address();
		add.setCity("Pathankot");
		add.setPinCode(145001);
		return add;
	}
}
