package com.traincompanion;

import java.util.LinkedList;
public class CompartmentNavigation {

	private LinkedList<Compartment> compartmentList = new LinkedList<>();
	
	public void traverseForward(){
		
		for(Compartment c: compartmentList)
		{
			 System.out.println(c.number + " - " + c.service);
		}
	}
	
	public void traverseBackward() {
		for(int i = compartmentList.size()-1; i>=0; i--)
		{
			Compartment c = compartmentList.get(i);
			System.out.println(c.number + " - " + c.service);
		}
	}
	
	public void addCompartment(Compartment c) {
		compartmentList.add(c);
	}
	
	public void addCompartment(int index,Compartment c) {
		 if(index < 0 || index > compartmentList.size()) {
	            System.out.println("Invalid index");
	            return;
	     }
		compartmentList.add(index,c);
	}
	
	public void removeCompartment() {
		if(compartmentList.size()!=0)
		    compartmentList.removeLast();
		else
			System.out.println("No any compartment in train");
	}
	
	public void removeCompartment(int index) {
		
		 if (index < 0 || index >= compartmentList.size()) {
	            System.out.println("Invalid index");
	            return;
	        }
		 
		if(compartmentList.size()!=0)
			compartmentList.remove(index);
		else
			System.out.println("No any compartment in train");
	}
	
	public void displayAdjacentCompartment(int index) {
		
		 if (index < 0 || index >= compartmentList.size()) {
	            System.out.println("Invalid index");
	            return;
	        }

	        if (compartmentList.size() == 1) {
	            System.out.println("Only one compartment present");
	            return;
	        }
		
		if(index > 0) {
		Compartment prev = compartmentList.get(index-1);
		System.out.println("Previous: " + prev.number + " - " + prev.service);
		}
		
		if(index < compartmentList.size() - 1)
		{
			 Compartment next = compartmentList.get(index + 1);
		        System.out.println("Next: " + next.number + " - " + next.service);
		}
		
	}
	
}
