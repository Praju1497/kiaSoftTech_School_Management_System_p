package com.prajakta.School_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {

	  private static final String URL = "jdbc:mysql://localhost:3306/managementl";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";

	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}