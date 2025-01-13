package com.app.configFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.resources.Address;
import com.app.resources.Student;

@Configuration
public class MyConfigFile 
{
	Address add1;
	
	@Bean
	public Student std()
	{
		Student std1 = new Student();
		std1.setAge(29);
		std1.setGender('M');
		std1.setName("Abhishek");
		std1.setAdd(addr());
		return std1;
	}
	
	@Bean
	public Address addr()
	{
		add1 = new Address();
		add1.setCity("Pathankot");
		add1.setPinCode(145001);
		return add1;
	}
}
