package com.abhi.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Abhishek");
        e.setSalary(44000);
        e.setDesignation("Developer");
        e.setAge(27);
        
        Configuration cfg = new Configuration().configure("com/abhi/HibernateConfigfile/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session ss = sf.openSession();
        Transaction ts = ss.beginTransaction();
        ss.save(e);
        ts.commit();    }
}
