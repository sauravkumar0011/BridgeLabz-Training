package com.parceltracker;

public class ParcelTracker {

	private Stage head;
	private Stage current;
	
	public void intializeStages() {
		
		Stage packed = new Stage("Packed");
		Stage shipped = new Stage("Shipped");
		Stage inTransit = new Stage("In Transit");
		Stage delivered = new Stage("Delivered");
		
		packed.next = shipped;
		shipped.next = inTransit;
		inTransit.next = delivered;
				
		head = packed;
		current = head;
	}
	
	public void moveForward() {
		
		if(current == null) {
			System.out.println("Parcel tracking unavailable");
			return;
		}
		
		if(current.next == null) {
			System.out.println("Parcel already delevered");
			return;
		}
		
		current = current.next;
		System.out.println("Parcel moved to: " + current.name);
	}
	
	public void addCheckPoint(String afterStage, String newStage)
	{
		Stage temp = head;
		while(temp!=null) {
		   if(temp.name.equals(afterStage)) {
			  Stage newNode = new Stage(newStage);
			  newNode.next = temp.next;
			  temp.next = newNode;
			  
			  System.out.println("Checkpoint added: " + newStage);
              return;
		   }
		   temp = temp.next;
		}
		
		 System.out.println("Stage not found: " + afterStage);
	}
	
	public void displayTracking() {

        if (head == null) {
            System.out.println("No tracking information available");
            return;
        }

        Stage temp = head;
        System.out.print("Parcel Journey: ");

        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

        System.out.println();
    }
}
