package com.user.data;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDAOImpl implements UserDAO 
{
	boolean flag=false;
	File file=null;
	 public UserDAOImpl() 
	 {	
			file=new File("D:\\Allianz Pgm\\files\\user1.txt");
		
	 }	
	@Override
	public Integer serialize(HashSet<User> hashSet) 
	{
		Integer flag=0;
		try
		{			
			flag=hashSet.size();
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(hashSet);
			oos.close();
		}
		catch(IOException e)
		{
			System.err.print(e);
		}
		return flag;
	}

	@Override
	public void Deserialize()
	{		
		try
		{
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			HashSet<User> u=(HashSet<User>)ois.readObject();
			System.out.println(u);		
			ois.close();
			
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	
	}


}
