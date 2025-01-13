package com.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.bean.T3;
import com.app.configFile.MyConfigFile;
import com.app.mapper.ResultMapper;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigFile.class);
		
		JdbcTemplate jtemp = ctx.getBean(JdbcTemplate.class);
		int id = 1201;
		int salary = 20000;
		String name = "Never Give Up1";
		String query = "insert into t3 values(?,?,?)";
		//int result = jtemp.update(query, id,name,salary);
//		if(result > 0)
//			System.out.println("Success");
//		else
//			System.out.println("Failed");
		String query1 = "select * from t3";
		List<T3> t = jtemp.query(query1, new ResultMapper());
		for(T3 t1:t)
		{
			System.out.print(t1.getId()+" ");
			System.out.print(t1.getName()+" ");
			System.out.print(t1.getSalary());
			System.out.println();
		}
			
	}
}
