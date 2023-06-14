package com.example.demo.controllers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends CrudRepository<Product,Integer> 
{
	List<Product> findAll()	;
}
