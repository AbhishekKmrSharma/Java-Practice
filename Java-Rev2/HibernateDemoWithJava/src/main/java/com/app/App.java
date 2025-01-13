package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.resource.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student std = new Student();
    	std.setRollno(101);
    	std.setAge(29);
    	std.setName("Abhishek Sharma");
    	
    	Configuration cfg = new Configuration().configure("com/configFile/hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session ss = sf.openSession();
    	Transaction tx = ss.beginTransaction();
    	ss.delete(std);
    	tx.commit();
    }
}
