package com.app.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Vaccine;

@Repository
public interface VaccineRepo extends CrudRepository<Vaccine, Integer>
{
	public Vaccine findByVName(String vName); 
}
