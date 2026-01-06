package com.campusconnect;

import java.util.ArrayList;

public class Course {

	private String course;
	private Faculty faculty;
	private ArrayList<Student> students;
	
	public Course(String course, Faculty faculty) {
		this.course = course;
		this.faculty = faculty;
		students = new ArrayList<>();
	}
	
	  public void addStudent(Student s) {
	        students.add(s);
	  }

	  public void removeStudent(Student s) {
	        students.remove(s);
	  }

      public void showCourseDetails() {
	        System.out.println("Course: " + course);
	        faculty.showDetails();
	        System.out.println("Enrolled Students: " + students.size());
	  }
}
