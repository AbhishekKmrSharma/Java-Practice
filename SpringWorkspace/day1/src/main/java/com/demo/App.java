package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory ctx = new ClassPathXmlApplicationContext("first.xml");
		
		CarTypes obj = (CarTypes) ctx.getBean("dai");
		
		System.out.println(obj);
    }
}
