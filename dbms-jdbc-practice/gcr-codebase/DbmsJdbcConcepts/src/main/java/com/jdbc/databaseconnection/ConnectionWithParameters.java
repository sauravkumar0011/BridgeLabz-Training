package com.jdbc.databaseconnection;

import java.sql.*;

public class ConnectionWithParameters {

	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/mypractice";
		
		// connection properties
		java.util.Properties properties= new java.util.Properties();
		
		properties.setProperty("user", "root");
		properties.setProperty("password", "Mysql@123");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval","true");
		
		return DriverManager.getConnection(url,properties);
	}
	
	public static void main(String[] args)
	{
		try {
			getConnection();
			System.out.println("Database Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
