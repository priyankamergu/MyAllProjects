package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	
	private static Connection connection=null;
	public static Connection getConnect() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
