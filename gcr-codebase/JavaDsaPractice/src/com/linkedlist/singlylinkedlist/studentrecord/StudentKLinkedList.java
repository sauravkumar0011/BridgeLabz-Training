package com.linkedlist.singlylinkedlist.studentrecord;

public class StudentKLinkedList {

	Node head;
	
	//Add at beginning 
    public void addAtBeginning(int rollNumber, String name, int age, char grade)
    {
    	Node newNode = new Node(rollNumber, name, age, grade);
    	newNode.next = null;
    	head = newNode;
    }
    
    //Add at end
    public void addAtEnd(int rollNumber, String name, int age, char grade)
    {
    	Node newNode = new Node(rollNumber, name, age, grade);
    	if(head == null)
    	{
    		head = newNode;
    		return;
    	}
    	
    	Node temp = head;
    	while(temp.next!=null)
    	{
    		temp = temp.next;
    	}
    	temp.next = newNode;
    }
    
    //Add at specific position
    public void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos <= 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Node newNode = new Node(rollNo, name, age, grade);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    //Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search by Roll Number
    public void searchStudent(int rollNo) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade by Roll Number
    public void updateGrade(int rollNo, char newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        Node temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Helper method
    private void displayStudent(Node s) {
        System.out.println(
            "Roll No: " + s.rollNo +
            ", Name: " + s.name +
            ", Age: " + s.age +
            ", Grade: " + s.grade
        );
    }
}
