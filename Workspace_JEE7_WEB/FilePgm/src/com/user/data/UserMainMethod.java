package com.user.data;

import java.util.Set;
import java.util.*;

public class UserMainMethod {

	public static void main(String[] args) 
	{
		HashSet<User> hashSet=new HashSet<User>();
		hashSet.add(new User(1,"Neha",22,56.67f));
		hashSet.add(new User(2,"Priya",23,77.06f));
		hashSet.add(new User(3,"Komal",22,78.7f));
		
		
		UserDAO user=new UserDAOImpl();
		Integer res=user.serialize(hashSet);
		if(res==0)
			System.out.println("No user are inserted");
		else
			System.out.println(res+" user are inserted");
		user.Deserialize();
		
		
		

	}

}
