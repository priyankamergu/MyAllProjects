package com.dao;

import com.suit.pojo.User;

public class UserDAO 
{
	public User save(User user)
	{
		System.out.println(user);
		return user;
	}
	public void delete(User user)
	{
		user=null;
		System.out.println("Product DAO : "+user);
	}
}
