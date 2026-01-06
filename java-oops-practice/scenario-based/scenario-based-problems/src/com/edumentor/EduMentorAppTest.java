package com.edumentor;

public class EduMentorAppTest {

	public static void main(String[] args) {

		    Learner l1 = new Learner("Saurav", "saurav@mail.com", 101, "Short time");

	        String[] q = {"Q1", "Q2", "Q3"};
	        String[] a = {"A", "B", "C"};

	        Quiz quiz = new Quiz("Easy", q, a, 10);
	        l1.learnerDetails();
	        System.out.println("Score Percentage: " + quiz.generatePercentage(2));
	        Course c1 = new ShortCourse("Java Basics");

	        c1.generateCertifiate();
	} 

}
