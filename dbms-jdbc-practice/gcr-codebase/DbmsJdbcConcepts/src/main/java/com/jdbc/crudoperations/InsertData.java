package com.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jdbc.databaseconnection.BasicConnection;

public class InsertData {

	public static void insertStudent(String name, String email, int age, String grade) {
		String sql = "INSERT INTO students(name, email, age, grade, enrollment_date) VALUES (?,?,?,?,?)";

		try (Connection conn = BasicConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, age);
			ps.setString(4, grade);
			ps.setDate(5, new java.sql.Date(System.currentTimeMillis()));

			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Insert Successfully");
				System.out.println("Rows Affected: " + rowsAffected);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		insertStudent("Saurav", "sauravkum.dev@gmail.com", 22, "A+");
		insertStudent("Himanshu", "Himanshu_singh@gmail.com", 25, "B+");
	}

}
