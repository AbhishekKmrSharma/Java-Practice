package com.app.dao;

import java.util.List;

import com.app.models.Products;



public interface IProductsDao 
{
	List<Products> getProducts();
	void insertProducts();
}
