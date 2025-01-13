package com.configfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.resource.Address;
import com.resource.Student;

@Configuration
@Lazy
public class MyConfigFile 
{
	Address add = new Address();
	@Bean
	Student std()
	{
		Student s1 = new Student();
		s1.setName("Abhishek");
		s1.setRollno(101);
		s1.setAdd(add());
		System.out.println("Hello");
		return s1;
	}
	
	@Bean
	Address add()
	{
		add.setCity("PTK");
		add.setPincode(145001);
		return add;
	}
	
	//used for construct injection
	@Bean
	Student std2()
	{
		add();
		return new Student(101, "Abhishek",add);
	}
}




