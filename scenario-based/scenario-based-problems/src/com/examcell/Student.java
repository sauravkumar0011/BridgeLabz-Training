package com.examcell;

public class Student {

	 String name;
	    int score;

	    Student(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }

	    void show() {
	        System.out.println(name + " - Score: " + score);
	    }
}
