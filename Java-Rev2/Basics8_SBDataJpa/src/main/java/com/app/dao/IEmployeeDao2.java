package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.models.Employee;

public interface IEmployeeDao2 extends PagingAndSortingRepository<Employee, Integer>
{

}
