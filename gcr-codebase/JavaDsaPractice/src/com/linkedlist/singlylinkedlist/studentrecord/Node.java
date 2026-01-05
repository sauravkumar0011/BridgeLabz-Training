package com.linkedlist.singlylinkedlist.studentrecord;

class Node{
	
	int rollNo;
	String name;
	int age;
	char grade;
	Node next;
	
	Node(int rollNo, String name, int age, char grade)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next  = null;
	}
}

