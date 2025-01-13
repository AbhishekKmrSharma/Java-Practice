package com.app.service;

import com.app.dto.StudentDto;
import com.app.models.Student;

import java.util.*;

public interface IService 
{
	public String regStudent(StudentDto dto);
	public List<Student> getStudentsAll();
	public String deleteById(int id);
}
