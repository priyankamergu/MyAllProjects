package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_DAO_Impl implements Login_DAO {

	public Login_DAO_Impl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.err.print(e);
		}
	}

	private Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC", "root", "");
	}

	@Override
	public boolean validate(Login login) {
		String sql = "SELECT * from login where Username=? and Password=? ";
		boolean isValid=false;
		try (Connection connection = getConnect(); 
			PreparedStatement prepared = connection.prepareStatement(sql);) {
			prepared.setString(1, login.getUsername());
			prepared.setString(2, login.getPassword());
			ResultSet rs = prepared.executeQuery();
			if (rs.next()) {
				isValid = true;
			}

		} catch (Exception e) {
			System.err.print(e);
		}

		return isValid;

	}
}
