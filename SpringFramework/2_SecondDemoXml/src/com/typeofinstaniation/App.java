package com.typeofinstaniation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App
{
	public static void main(String[] args) 
	{
		//ApplicationContext c = new ClassPathXmlApplicationContext("com/xmlConfigurationfiles/lazyOrEager.xml");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/xmlConfigurationfiles/lazyOrEager.xml"));
		
		
	}
}
