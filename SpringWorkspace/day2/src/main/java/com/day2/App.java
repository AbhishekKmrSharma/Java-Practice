package com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct=new ClassPathXmlApplicationContext("second.xml");
        
        Object obj=ct.getBean("emp");
        
        System.out.println(obj);
        
    }
}
