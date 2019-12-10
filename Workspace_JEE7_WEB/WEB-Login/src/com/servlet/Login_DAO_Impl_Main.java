package com.servlet;

public class Login_DAO_Impl_Main {

	public static void main(String[] args) {
		
		Login_DAO login_DAO = new Login_DAO_Impl();
		Login login = new Login("abc", "xyz");
		boolean result = login_DAO.validate(login);
		if(result==true)
			System.out.println("Success");
		else
			System.out.println("Not Success");
	}

}
