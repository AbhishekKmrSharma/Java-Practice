package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.views.View;

@Service
public class IServiceImpl implements IService 
{
	@Autowired
	private IEmployeeDao dao;

	
	@Override
	public <T extends View> List<T> fetchDetailsBySalaryLessThan(int amount, Class<T> cls) 
	{
		return dao.findBySalaryLessThan(amount, cls);
	}

}
