package com.example.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Student;

public interface Dao extends JpaRepository<Student, Integer> 
{
	
}
