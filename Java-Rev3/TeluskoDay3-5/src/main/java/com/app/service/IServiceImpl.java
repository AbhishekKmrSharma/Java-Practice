package com.app.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService
{
	@Override
	public String wish() 
	{
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		if(hour > 12)
			return "Good Evening";
		else if(hour < 12)
			return "Good Night";
		else
			return null;
	}

}
