package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.models.Employee;

public interface IEmplyeeDao extends CrudRepository<Employee, Integer>
{
	public Optional<Employee> findByName(String name);
}
