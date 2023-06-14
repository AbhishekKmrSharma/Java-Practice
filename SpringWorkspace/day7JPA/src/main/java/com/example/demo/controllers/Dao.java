package com.example.demo.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<Emp, Integer> 
{
	List<Emp> findByDesig(String desig);
	
	
	List<Emp> findBySalaryGreaterThan(int salary);
	
	@Query("from Emp where salary>?1 order by age desc")
	List<Emp> findBySorted(int salary);
}
