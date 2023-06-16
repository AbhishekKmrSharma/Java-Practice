package com.serviceLayer;

import com.beans.Student;
import com.daoLayer.DaoInt;

public class ServiceClass implements ServiceInt
{
	private DaoInt dao;
	public void setDao(DaoInt dao) 
	{
		this.dao = dao;
	}


	@Override
	public boolean serviceLayer(Student std) 
	{
		boolean status = dao.insert(std);
		return status;
	}

}
