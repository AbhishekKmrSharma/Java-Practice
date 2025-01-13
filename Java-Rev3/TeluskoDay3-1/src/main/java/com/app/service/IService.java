package com.app.service;

import java.util.List;

import com.app.models.Employee;
import com.app.views.View;

public interface IService 
{
	public <T extends View>List<T> fetchDetailsBySalaryLessThan(int amount, Class<T> cls);
}
