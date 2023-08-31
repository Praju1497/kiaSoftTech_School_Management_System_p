package com.prajakta.School_management_system;
import java.util.List;
public class MainApp {


		
		  public static void main(String[] args) {
		        StudentDAO studentDAO = new StudentDAO();
		        List<Student> students = studentDAO.getAllStudents();
		        
		        for (Student student : students) {
		            System.out.println("Student ID: " + student.getId());
		            System.out.println("Student Name: " + student.getName());
		            System.out.println("Student Age: " + student.getAge());
		            System.out.println("----------------------");
		        }
		        
		        CourseDao courseDAO = new CourseDao();
		        List<Course> courses = courseDAO.getAllCourses();
		        
		        for (Course course : courses) {
		            System.out.println("Course ID: " + course.getId());
		            System.out.println("Course Name: " + course.getName());
		            System.out.println("Instructor: " + course.getInstructor());
		            System.out.println("----------------------");
		        }
		    }

}
