package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Employee;
import com.app.views.View;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>
{
	public <T extends View>List<T> findBySalaryLessThan(int amount, Class<T> cls);
}
