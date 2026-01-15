package com.hospitalqueue;

public class Patient {

	String name;
    int criticality;

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    void show() {
        System.out.println(name + " - Criticality: " + criticality);
    }
}
