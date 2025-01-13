package com.app.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.models.Vaccine;

@Repository
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer>
{

}
