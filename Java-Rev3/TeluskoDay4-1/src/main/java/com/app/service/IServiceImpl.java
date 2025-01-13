package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Course;

@Service
public class IServiceImpl implements IService
{
	@Autowired
	private Course course;
	
	@Override
	public Course getCourses()
	{
		course = new Course("Java", 101, 4000);
		return course;
	}

}
