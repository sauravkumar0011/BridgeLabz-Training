package com.edumentor;

abstract class Course{
	String courseName;
    public Course(String name) { this.courseName = name; }
	protected abstract void generateCertifiate();
}
