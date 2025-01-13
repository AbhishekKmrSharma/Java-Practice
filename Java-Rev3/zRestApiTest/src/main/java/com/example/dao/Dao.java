package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.repository.Student;

public interface Dao extends JpaRepository<Student, Integer>
{
	
}
