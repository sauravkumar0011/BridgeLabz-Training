package com.trafficmanager;

public class Roundabout {
    
	Vehicle head;
	
	public void addVehicle(Vehicle v) {
		
		Vehicle newNode = new Vehicle(v.number,v.name);
		
		if(head == null) {
			
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Vehicle temp = head;
		while(temp.next!=head)
		{
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.next = head;
	}
	
    public void removeVehicle(Vehicle v) {
		
		
		if(head == null) {
			 System.out.println("Roundabout is empty");
			return;
		}
		
		
		if(head.number == v.number)
		{
			if(head.next == head) {
				head = null;
			}
			else {
				Vehicle last = head;
                while (last.next != head) {
                    last = last.next;
                }
                head = head.next;
                last.next = head;
			}
			
			System.out.println("Vehicle " + v.number + " exited");
            return;
		}
		
		Vehicle curr = head;
		Vehicle prev = null;

		 do {
	            prev = curr;
	            curr = curr.next;

	            if (curr.number == v.number) {
	                prev.next = curr.next;
	                System.out.println("Vehicle " + v.number + " exited");
	                return;
	            }
	        } while (curr != head);

	        System.out.println("Vehicle not found");
	}
    
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}
