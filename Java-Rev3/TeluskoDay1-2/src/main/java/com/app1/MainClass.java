package com.app1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app1.beans.Student;

public class MainClass
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationProperties.xml");
		
//		String[] beanNames = ctx.getBeanDefinitionNames();
//
//        // Print all bean names
//        System.out.println("Beans in the Spring container:");
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
		
		Student std = (Student) ctx.getBean("id");
		
		System.out.println(std);
	}
}
