package com.linkedlist.singlylinkedlist.studentrecord;

public class StudentTest {

	public static void main(String[] args) {
		
		    StudentKLinkedList list = new StudentKLinkedList();

	        list.addAtBeginning(1, "Amit", 20, 'A');
	        list.addAtEnd(2, "Saurav", 21, 'B');
	        list.addAtEnd(3, "Ravi", 22, 'C');

	        System.out.println("All Students:");
	        list.displayAll();

	        System.out.println("\nSearch Roll No 2:");
	        list.searchStudent(2);

	        System.out.println("\nUpdate Grade:");
	        list.updateGrade(3, 'A');

	        System.out.println("\nDelete Roll No 1:");
	        list.deleteByRollNo(1);

	        System.out.println("\nFinal List:");
	        list.displayAll();
	    }
}
