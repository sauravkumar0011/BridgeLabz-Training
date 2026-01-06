package com.edumentor;

public class Learner extends User{

    String courseType;
    double progress;
	
	public Learner(String name, String email, int userId, String courseType)
	{
		super(name,email,userId);
		this.courseType = courseType;
	}
	
	public void updateProgress(double progress)
	{
		this.progress = progress;
	}
	
	public void learnerDetails() {
	    System.out.println("Learner Name: " + getName());
	    System.out.println("Mode: " + courseType);
	}
}
