package com.abhishek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.configfile.*;
import com.resource.Student;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigFile.class);
        //Object obj = ctx.getBean("std2");
        //Student e1 = ctx.getBean("std");// both are generating same result
        //System.out.println(obj+" \n");
    }
}
