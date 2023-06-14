package com.demoHibernateBasic;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        Employee e=new Employee();
        
        e.id=13;
        e.name="Abhishek";
        e.age=26;
        e.salary=70000;
        e.designation="Developer";
        
        Configuration cf=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory factory=cf.buildSessionFactory();
        
        Session ss=factory.openSession();
        
        Transaction ts=ss.beginTransaction();
        
        ss.save(e);
        ts.commit();
     }
}
