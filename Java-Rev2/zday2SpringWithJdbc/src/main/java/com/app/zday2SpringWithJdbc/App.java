package com.app.zday2SpringWithJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.T2;
import com.app.resources.ConfigFile;
import com.app.mapper.*;

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigFile.class);
        JdbcTemplate j = (JdbcTemplate) ac.getBean("jTemplate");
        int id = 102;
        String name = "Verma";
        int salary = 300000;
        
        //String query = "INSERT into t2 values(?,?,?)";
        
        String query = "SELECT * from t2";
        
        
        List<T2> l = j.query(query, new T2Mapper());
        
        for(T2 t: l)
        {
        	System.out.println(t.getId()+" "+t.getName()+" "+t.getSalary());
        }
    }
}
