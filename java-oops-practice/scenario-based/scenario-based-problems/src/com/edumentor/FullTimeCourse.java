package com.edumentor;

public class FullTimeCourse extends Course implements ICertifiable{

	public FullTimeCourse(String name) { super(name); }

    @Override
    public void generateCertifiate() {
        System.out.println("Generating Official Diploma for Full-Time Course: " + courseName);
    }
}
