package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Employee;

public interface IEmployeeDao3 extends JpaRepository<Employee, Integer>
{

}
