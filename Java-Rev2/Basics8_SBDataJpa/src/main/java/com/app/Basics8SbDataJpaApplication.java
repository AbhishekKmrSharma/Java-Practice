package com.app;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.models.Employee;
import com.app.service.IService;

@SpringBootApplication
public class Basics8SbDataJpaApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Basics8SbDataJpaApplication.class, args);
		
		IService i = ctx.getBean(IService.class);
		
//		Employee e = new Employee(9,"Sharma",358);
		
//		String result1 = i.insert(new Employee(91,"Sharma1",3581));
//		
//		System.out.println(result1);
		
		Optional<Employee> result2 = i.findById(111);
		Optional<Employee> result3 = i.findByName("sharma");
		
//		if(result2.isPresent())
//		{
//			Employee e = result2.get();
//			System.out.println(e);
//		}
//		else
//		{
//			System.out.println("No Employee with given ID");
//		}
		
//		if(result3.isPresent())
//		{
//			Employee e = result3.get();
//			System.out.println(e);
//		}
//		else
//		{
//			System.out.println("No Employee with given Name");
//		}
		
//		Iterable<Employee> emp = i.sortAll(true,"salary");
//		for(Employee e: emp)
//		{
//			System.out.println(e);
//		}
		
		//i.getPages(0, 2, true, "salary").forEach(emp->System.out.println(emp));
		
		//i.getPageCountDynamically(8);
		
		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(9);
		//list.add(1201);
		
		String res = i.deleteAllById(list);
		//String res = i.deleteMajorityRecordsById(list);
		System.out.println(res);
	}

}
