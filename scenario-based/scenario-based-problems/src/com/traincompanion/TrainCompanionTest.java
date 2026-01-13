/*
TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
 */
package com.traincompanion;

public class TrainCompanionTest {

	public static void main(String[] srgs) {
		
		CompartmentNavigation nav = new CompartmentNavigation();
				 
		 // Add compartments
        nav.addCompartment(new Compartment(1, "General"));
        nav.addCompartment(new Compartment(2, "Sleeper"));
        nav.addCompartment(new Compartment(3, "WiFi"));
        nav.addCompartment(new Compartment(4, "Pantry"));

        System.out.println("Forward Traversal:");
        nav.traverseForward();

        System.out.println("\nBackward Traversal:");
        nav.traverseBackward();

        // Insert at specific position
        nav.addCompartment(2, new Compartment(5, "AC"));

        System.out.println("\nAfter inserting AC at index 2:");
        nav.traverseForward();

        // Display adjacent compartments
        System.out.println("\nAdjacent compartments of index 2:");
        nav.displayAdjacentCompartment(2);

        // Remove last compartment
        nav.removeCompartment();
        System.out.println("\nAfter removing last compartment:");
        nav.traverseForward();

        // Remove compartment by index
        nav.removeCompartment(1);
        System.out.println("\nAfter removing compartment at index 1:");
        nav.traverseForward();
	}
}
