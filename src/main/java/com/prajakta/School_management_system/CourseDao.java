package com.prajakta.School_management_system;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CourseDao {
	  private static final String SELECT_ALL_COURSES = "SELECT * FROM courses";
	    
	    public List<Course> getAllCourses() {
	        List<Course> courses = new ArrayList<>();
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COURSES);
	             ResultSet resultSet = preparedStatement.executeQuery()) {
	            
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                String instructor = resultSet.getString("instructor");
	                courses.add(new Course(id, name, instructor));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return courses;
	    }
}
