package com.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.model.Vaccine;
import com.app.service.Iservice;
import com.app.service.ServiceImpl;

@SpringBootApplication
public class TeluskoDay25Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay25Application.class, args);
		
//		Vaccine v = new Vaccine("Covishield","Cova",1000);
		Iservice data = ctx.getBean(ServiceImpl.class);
//		System.out.println(data.addVaccine(v));;
		
//		Vaccine v1 = new Vaccine("Covaccine","Bharat",2500);
//		Vaccine v2 = new Vaccine("Pfizer","Moderna",3500);
//		Vaccine v3 = new Vaccine("Sputnik","Russian",4500);
//		
//		List<Vaccine> vData = new ArrayList<>();
//		vData.add(v1);
//		vData.add(v2);
//		vData.add(v3);
//		
//		data.addMultiVaccine(vData);
//		
//		for (Vaccine vaccine : vData) 
//		{
//			System.out.println(vaccine.getvId());
//		}
		
		
		System.out.println(data.vCount());
		System.out.println(data.vExist(4));
		System.out.println(data.vExist(41));
		System.out.println(data.allVaccine());
		System.out.println(data.checkAvailability(1));
		System.out.println(data.checkAvailability(10));
		System.out.println(data.deleteVaccine(10));
		System.out.println(data.deleteVaccine(4));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Vaccine v = data.findVbyName("Pfizer");
		System.out.println(v);
	}

}
