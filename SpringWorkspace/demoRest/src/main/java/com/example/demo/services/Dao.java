package com.example.demo.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface Dao extends CrudRepository<Emp, Integer> 
{
	public List<Emp> findByDesignation(String designation);
}
