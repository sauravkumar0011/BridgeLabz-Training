package com.campusconnect;

public class Student extends Person implements ICourseActions{

	private double[] grades;
	private int gradeCount = 0;
	
	Student(int id, String name, String email)
	{
	  super(name, email, id);
	  grades = new double[5];
	}
	
	 public void addGrade(double grade) {
	        grades[gradeCount++] = grade;
	 }
	
	 public double calculateGPA() {
	        double sum = 0;
	        for (int i = 0; i < gradeCount; i++) {
	            sum += grades[i];
	        }
	        return gradeCount == 0 ? 0 : sum / gradeCount;
	    }
	 
	@Override
	public void enrollCourse(Course course) {
		course.addStudent(this);
 	}
	
	@Override
	public void dropCourse(Course course)
	{
		course.removeStudent(this);
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("Student id:" + id);
		System.out.println("Student name:" + name);
		System.out.println("Student Gpa:" + calculateGPA());
	}
}
