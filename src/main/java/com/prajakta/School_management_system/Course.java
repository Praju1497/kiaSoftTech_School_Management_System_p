package com.prajakta.School_management_system;

public class Course {
	 private int id;
	    private String name;
	    private String instructor;

	    // Constructors, getters, and setters
	    
	    public Course(int id, String name, String instructor) {
	        this.id = id;
	        this.name = name;
	        this.instructor = instructor;
	    
}
	    

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getInstructor() {
	        return instructor;
	    }

	    public void setInstructor(String instructor) {
	        this.instructor = instructor;
	    }
}
