package com.examcell;

public class ExamCell {

	  static Student[] merge(Student[] left, Student[] right) {
	        Student[] result = new Student[left.length + right.length];
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            if (left[i].score >= right[j].score) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }

	        while (i < left.length) result[k++] = left[i++];
	        while (j < right.length) result[k++] = right[j++];

	        return result;
	    }
	  
	  static Student[] mergeSort(Student[] students) {
	        if (students.length <= 1) return students;

	        int mid = students.length / 2;

	        Student[] left = new Student[mid];
	        Student[] right = new Student[students.length - mid];

	        for (int i = 0; i < mid; i++) left[i] = students[i];
	        for (int i = mid; i < students.length; i++) right[i - mid] = students[i];

	        left = mergeSort(left);
	        right = mergeSort(right);

	        return merge(left, right);
	    }
	  
	  public static void main(String[] args) {

	        Student[] center1 = {
	            new Student("Aman", 92),
	            new Student("Riya", 88),
	            new Student("Kunal", 81)
	        };

	        Student[] center2 = {
	            new Student("Neha", 95),
	            new Student("Vikas", 90),
	            new Student("Pooja", 85)
	        };
	        
	        Student[] allStudents = new Student[center1.length + center2.length];

	        for (int i = 0; i < center1.length; i++) allStudents[i] = center1[i];
	        for (int i = 0; i < center2.length; i++) allStudents[i + center1.length] = center2[i];

	        Student[] rankList = mergeSort(allStudents);

	        for (Student s : rankList) {
	            s.show();
	        }
	    }
}
