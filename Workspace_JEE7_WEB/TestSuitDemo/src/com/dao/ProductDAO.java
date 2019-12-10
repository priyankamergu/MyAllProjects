package com.dao;

import com.suit.pojo.Product;

public class ProductDAO
{
	public Product save(Product product)
	{
		System.out.println(product);
		return product;
	}
	public void delete(Product product)
	{
		product=null;
		System.out.println("Product DAO : "+product);
	}
}
