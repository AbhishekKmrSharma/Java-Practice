package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.dto.StudentDto;
import com.app.service.IService;

@SpringBootApplication
public class TeluskoDay33Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay33Application.class, args);
		
		IService i = ctx.getBean(IService.class);
		
		StudentDto dto = new StudentDto(2,"Abhishek2", 90, "CHD");
		
		String result = i.regStudent(dto);
		System.out.println(result);
		
		i.getStudentsAll().forEach(v->System.out.println(v));
		
		String status = i.deleteById(1);
		
		System.out.println(status);
		
		i.getStudentsAll().forEach(v->System.out.println(v));
	}

}
