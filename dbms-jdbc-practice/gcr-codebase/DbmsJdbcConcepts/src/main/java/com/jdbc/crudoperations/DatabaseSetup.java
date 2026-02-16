package com.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jdbc.databaseconnection.BasicConnection;

public class DatabaseSetup {

	public static void main(String[] args) {

		// Create Table
		String createTable = "CREATE TABLE IF NOT EXISTS students ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) UNIQUE NOT NULL, "
                + "age INT, "
                + "grade VARCHAR(10), "
                + "enrollment_date DATE"
                + ")";
		
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(createTable)){
			
			int rows = ps.executeUpdate();
			System.out.println(rows);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
