package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import com.app.dao.IEmployeeDao2;
import com.app.dao.IEmployeeDao3;
import com.app.dao.IEmplyeeDao;
import com.app.models.Employee;

@Service
public class ServiceImpl implements IService 
{
	@Autowired
	private IEmplyeeDao dao;
	@Autowired
	private IEmployeeDao2 dao2;
	@Autowired
	private IEmployeeDao3 dao3;
	

	@Override
	public String insert(Employee e) {
		dao.save(e);
		return "added";
	}

	@Override
	public Optional<Employee> findById(int eId) {
		Optional<Employee> opt = dao.findById(eId);
		if (opt.isPresent()) {
			return dao.findById(eId);
		} else
			return Optional.empty();
	}

	@Override
	public Optional<Employee> findByName(String name) {
		Optional<Employee> opt = dao.findByName(name);
		if (opt.isPresent())
			return dao.findByName(name);
		else
			return Optional.empty();
	}
	
	public String deleteAllById(List<Integer> ids)
	{
		Iterable<Employee> list = dao.findAllById(ids);
		
		if(((List<Employee>) list).size() == ids.size())
		{
			dao.deleteAllById(ids);
			return "Deleted with Given Id's";
		}
		return "Error Occured";
		
	}
	
	
	//===================PagingAndSorting Methods

	@Override
	public Iterable<Employee> sortAll(boolean order, String... values) 
	{
		Sort sort = Sort.by(order?Direction.ASC:Direction.DESC, values);
		return dao2.findAll(sort);
	}

	@Override
	public Iterable<Employee> getPages(int pageNumber, int pageSize, boolean order, String... values) 
	{
		Sort sort = Sort.by(order?Direction.ASC:Direction.DESC, values);
		PageRequest pageable1 = PageRequest.of(pageNumber, pageSize, sort);
		PageRequest pageable2 = PageRequest.of(pageNumber, pageSize);
		Page<Employee> page = dao2.findAll(pageable2);
		return page.getContent();
	}

	@Override
	public Iterable<Employee> getPageCountDynamically(int pageSize) 
	{
		long dataCount = dao.count();
		
		long pageCount = dataCount/pageSize;  // 7/3 = 
		
		pageCount = dataCount%pageSize==0?pageCount:++pageCount;
		
		for(int i = 0; i < pageCount; i++)
		{
			System.out.println("========================="+"Page = "+i+"========================");
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page page = dao2.findAll(pageable);
			System.out.println(page.getContent());
			System.out.println();
		}
		
		return null;
	}
	
	//=============================JpaRepo Methods========================================
	
	
	//compare this method with CrudRepo methods deleteAllById()
	@Override
	public String deleteMajorityRecordsById(List<Integer> ids) 
	{
		List<Employee> list = dao3.findAllById(ids);
		
		if(list.size() != 0)
		{
			dao3.deleteAllByIdInBatch(ids);
			return "Deleted with Given ID's";
		}
		
		return "Error Occured";
	}
	
	
	
	
	
	

}
