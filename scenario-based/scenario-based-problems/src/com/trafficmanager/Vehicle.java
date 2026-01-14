package com.trafficmanager;

public class Vehicle {
   int number;
   String name;
   Vehicle next;
   
   public Vehicle(int number, String name){
	   this.number = number;
	   this.name = name;
	   this.next = null;
   }
}
