package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.models.Employee;

public interface IService 
{
	public String insert(Employee e);
	public Optional<Employee> findById(int eId);
	public Optional<Employee> findByName(String name);
	public String deleteAllById(List<Integer> ids);
	
	
	//PagingAndSortingMethods-----------Dont be confuse Iterable and List are used to hold particlar type of obj more than 1
	
	public Iterable<Employee> sortAll(boolean order, String... values);
	public Iterable<Employee> getPages(int pageNumber, int pageSize, boolean order, String... values);
	public Iterable<Employee> getPageCountDynamically(int pageSize);
	
	//JpaRepo Methods
	
	public String deleteMajorityRecordsById(List<Integer> ids);
	
}
