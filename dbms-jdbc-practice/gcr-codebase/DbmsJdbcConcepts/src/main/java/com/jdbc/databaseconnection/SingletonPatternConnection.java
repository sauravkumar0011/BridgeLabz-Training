package com.jdbc.databaseconnection;

import java.sql.*;

public class SingletonPatternConnection {

    private static volatile SingletonPatternConnection instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/mypractice";
    private static final String USER = "root";
    private static final String PASSWORD = "Mysql@123";

    private SingletonPatternConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database Driver not found", e);
        }
    }

    public static SingletonPatternConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            synchronized (SingletonPatternConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new SingletonPatternConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    // Main method to test connection
    public static void main(String[] args) {

        try {
            SingletonPatternConnection singleton = SingletonPatternConnection.getInstance();
            Connection conn = singleton.getConnection();

            // Simple test query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT 1");

            if (rs.next()) {
                System.out.println("Query Executed Successfully! Result: " + rs.getInt(1));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

            System.out.println("Connection Closed Successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
