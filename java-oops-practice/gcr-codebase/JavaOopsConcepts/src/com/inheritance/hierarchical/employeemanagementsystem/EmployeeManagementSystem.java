package com.inheritance.hierarchical.employeemanagementsystem;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        //Polymorphism: parent reference holding different employee types
        Employee emp1 = new Manager("saurav", 151, 755000, 8);
        Employee emp2 = new Developer("shivam", 189, 650000, "c++");
        Employee emp3 = new Intern("ravi", 105, 150500, 6);

        emp1.displayDetails();
        System.out.println("---------------------");

        emp2.displayDetails();
        System.out.println("---------------------");

        emp3.displayDetails();
    }
}
