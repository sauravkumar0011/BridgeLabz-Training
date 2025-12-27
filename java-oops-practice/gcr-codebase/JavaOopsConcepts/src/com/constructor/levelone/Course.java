package com.constructor.levelone;

public class Course {

	public String courseName;
	public int duration;
	public int fees;
	public static String institute = "Technocrats Institute of Technology";
	
	public Course(String courseName, int duration, int fees) {
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	
	public void displayCourseDetails() {
		System.out.println("Institute name: "+ Course.institute);
		System.out.println("Course name: "+this.courseName);
		System.out.println("Duration: "+this.duration);
		System.out.println("Course fees: "+this.fees);
	}
	
	public static void updateInstituteName(String name){
		Course.institute = name;
	}
	
	public static void main(String[] args) {
		
		Course c1= new Course("Data Science", 4, 70000);
		c1.displayCourseDetails();
		
		Course.updateInstituteName("TIT Technocrats");
		Course c2 = new Course("Artificial Intelligence", 4, 80000);
		c2.displayCourseDetails();
	}

}
