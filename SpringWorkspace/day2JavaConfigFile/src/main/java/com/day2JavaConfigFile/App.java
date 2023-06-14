package com.day2JavaConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = new AnnotationConfigApplicationContext(MyConfigFile.class);
        
        Object obj = ct.getBean("emp");
        System.out.println(obj);
    }
}
