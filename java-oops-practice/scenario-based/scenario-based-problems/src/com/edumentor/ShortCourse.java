package com.edumentor;

class ShortCourse extends Course implements ICertifiable{

	public ShortCourse(String name) { super(name); }

    @Override
    public void generateCertifiate() {
        System.out.println("Generating Digital Badge for Short Course: " + courseName);
    }
}
