package com.campusconnect;

public class CampusConnectAppTest {

	public static void main(String[] args) {
		
		    Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@college.edu");
	        Course java = new Course("Java Programming", f1);

	        Student s1 = new Student(1, "Saurav", "saurav@gmail.com");
	        s1.addGrade(8.5);
	        s1.addGrade(9.0);

	        s1.enrollCourse(java);

	        s1.showDetails(); 
	        System.out.println("-------------------------");  
	        java.showCourseDetails();

	}

}
