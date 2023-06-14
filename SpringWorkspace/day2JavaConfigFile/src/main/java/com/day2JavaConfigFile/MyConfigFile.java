package com.day2JavaConfigFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigFile 
{
	@Bean
	Employee emp()
	{
		Employee e1=new Employee();
		e1.setName("Abhishek");
		e1.setAge(25);
		e1.setAdd(new Address("PB","SC",145025));
		return e1;
	}
	
	@Bean(name ="emp1")
	Employee getEmp()
	{
		Address a1=new Address();
		a1.setCity("GSP");
		a1.setState("PB");
		a1.setPin(145025);
		return new Employee("Kumar",26,a1);
	}
	
}
