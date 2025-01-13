package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.dao.StudentDao;
import com.app.dao.StudentDaoImpl;
import com.app.models.Student;

@SpringBootApplication
public class TeluskoDay23Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay23Application.class, args);
		
		StudentDao data = ctx.getBean(StudentDaoImpl.class);
		
		Student std = new Student(1,"Abhishek",'M');
		
		data.insert(std);
	}

}
