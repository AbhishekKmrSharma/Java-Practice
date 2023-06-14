package com.demoHibernateBasic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee 
{
	@Id
	int id;
	String name;
	int age;
	int salary;
	String designation;
	
}
