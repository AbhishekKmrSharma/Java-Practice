package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.models.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>
{
	@Query("FROM Employee")
	public List<Employee> getEmployeeDetailsAll();
	
	@Query("FROM Employee where salary =:salary")
	public List<Employee> getDetailsBySalary(int salary);
	
	@Query("SELECT name FROM Employee WHERE salary Between :min AND :max")
	public List<String> getEmp(int min, int max);
	
	@Transactional
	@Modifying
	@Query("UPDATE Employee set salary = :salary WHERE name = :name")
	public void updateSalary(int salary, String name);
	
	@Transactional
	@Modifying
	@Query("DELETE from Employee WHERE id = :id")
	public int delEmpById(int id);
	
}
