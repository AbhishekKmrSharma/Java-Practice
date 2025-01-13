package com.app.SpringDemowithAdvJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configFile.MyConfigFile;
import com.resource.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigFile.class);
        
        Student s = ctx.getBean("std",Student.class);
        System.out.println(s);
        Object obj = ctx.getBean("std");
        System.out.println(obj);
    }
}
