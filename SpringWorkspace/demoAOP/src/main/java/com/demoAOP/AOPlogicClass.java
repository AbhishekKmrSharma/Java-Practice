package com.demoAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AOPlogicClass 
{
	@Before("execution(public void insert())")
	void openConnection()
	{
		System.out.println("Opened Connection");
	}
	
	@After("execution(public void insert())")
	void close()
	{
		System.out.println("Closed Connection");
	}
}
