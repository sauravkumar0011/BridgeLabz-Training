package com.encapsulation.employeemanagementsystem;

import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 =
                new FullTimeEmployee(101, "Saurav", 50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 =
                new PartTimeEmployee(102, "Rahul", 500, 40);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        //Polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();

            if (emp instanceof Department) {
                Department d = (Department) emp;
                System.out.println("Department: " + d.getDepartmentDetails());
            }

            System.out.println("------------------------");
        }

	}

}
