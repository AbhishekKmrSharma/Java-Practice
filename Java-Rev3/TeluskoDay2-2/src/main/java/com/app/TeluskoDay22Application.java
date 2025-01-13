package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.dao.IProductsDao;
import com.app.dao.ProductsDaoImp;
import com.app.models.Products;

@SpringBootApplication
public class TeluskoDay22Application 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay22Application.class, args);
		
		IProductsDao data = ctx.getBean(ProductsDaoImp.class);
		data.insertProducts();
		
		List<Products> prod = data.getProducts();
		
		for(Products a : prod)
		{
			System.out.println(a);
		}
	}

}
