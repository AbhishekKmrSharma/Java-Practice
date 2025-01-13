package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.app.dao.IStudentDao;
import com.app.dto.StudentDto;
import com.app.models.Student;

@Service
public class IServiceImpl implements IService
{

	private IStudentDao dao;
	
	public IServiceImpl(IStudentDao dao)
	{
		this.dao = dao;
	}
	
	@Override
	public String regStudent(StudentDto dto) 
	{
		Student std = new Student();
		BeanUtils.copyProperties(dto, std);
		Student std1 = dao.save(std);
		return "Student Data Save with ID : "+std1.getId();
	}

	@Override
	public List<Student> getStudentsAll() 
	{
		return dao.findAll();
	}

	@Override
	public String deleteById(int id) 
	{
		Optional<Student> opt = dao.findById(id);
		if(opt.isPresent())
		{
			dao.deleteById(id);
			return "deleted with ID : "+id;
		}
			
		else
			return "ID Doesnt Exist";
	}

}
