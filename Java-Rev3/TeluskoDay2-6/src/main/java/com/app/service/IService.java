package com.app.service;

import java.util.List;

import com.app.models.Vaccine;

public interface IService 
{
	public Iterable<Vaccine> fetchDetails(Boolean status, String... properties); //sorting
	public List<Vaccine> fetchDetailsByPagination(int pageNumber, int pageSize, Boolean status, String... properties);
}
