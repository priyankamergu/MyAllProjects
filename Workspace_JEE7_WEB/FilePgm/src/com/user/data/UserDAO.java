package com.user.data;

import java.util.HashMap;
import java.util.HashSet;

public interface UserDAO 
{
	public void Deserialize();
	public Integer serialize(HashSet<User> hashSet);
}
