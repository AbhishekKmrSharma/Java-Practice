package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.models.Products;

@Repository
public class ProductsDaoImp implements IProductsDao
{
	@Autowired
	private DataSource dataSource;
	String query = "select * from products";
	String query2 = "insert into products values(3,'Mobile',50000,'M')";
	List<Products> products = new ArrayList();

	@Override
	public List<Products> getProducts() 
	{
		try 
		{
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Products prod = new Products();
				prod.setpId(rs.getInt(1));
				prod.setpName(rs.getString(2));
				prod.setpCost(rs.getInt(3));
				prod.setpCat(rs.getString(4).charAt(0)); //Important---------------------------------------Important
				products.add(prod);
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public void insertProducts()
	{
		try
		{
		Connection cn = dataSource.getConnection();
		PreparedStatement ps = cn.prepareStatement(query2);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
