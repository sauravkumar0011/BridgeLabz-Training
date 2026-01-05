package com.linkedlist.singlylinkedlist.inventoryManagement;

public class InventoryManagement {

	Node head;
	
	//Add item at beginning
	public void addAtbeginning(String itemName, int itemId, int quantity, double price) {
	Node item = new Node(itemName, itemId, quantity, price);
	
	if(head == null)
		head = item;
	else {
		item.next = head;
		head = item;
	}
	}
	
	//Add item at end
	 //Add at end
    public void addAtEnd(String itemName, int itemId, int quantity, double price)
    {
    	Node newNode = new Node(itemName, itemId, quantity, price);
    	if(head == null)
    	{
    		head = newNode;
    		return;
    	}
    	
    	Node temp = head;
    	while(temp.next!=null)
    	{
    		temp = temp.next;
    	}
    	temp.next = newNode;
    }
    
    //Add at specific position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int pos) {
        if (pos <= 1) {
        	addAtbeginning(itemName, itemId, quantity, price);
            return;
        }

        Node newNode = new Node(itemName, itemId, quantity, price);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
  //Remove item based on itemId
    public void deleteByItemId(int itemId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }
    
    //Update the quantity of an item by Item ID
    public void updateByItemId(int itemId, int quantity) {
        Node temp = head;

        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = quantity;
                System.out.println("Item Quantity updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
   
    //Search for an item based on Item ID
    public void searchByItemId(int itemId) {
        Node temp = head;

        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Your item is :" + temp.itemName);
                System.out.println("item price :" + temp.price);
                return;
            }
        }
        System.out.println("Item not found");
    }
    
    //Calculate and display the total value of inventory 
    public void calculateAndDispalyTotalValue() {
        Node temp = head;
        if(temp == null)
        	 System.out.println("Item not found");
        
        double totalSum = 0.0;
        while (temp != null) {
        	totalSum = temp.quantity * temp.price;
        }
        if(totalSum > 0) {
        System.out.println("the total value of inventory is :" + totalSum);
        }
       return;
    }
    
    //Sort the inventory based on Item Price in ascending
    public void sortByItemPriceInAscendingOrder() {
       
    	 if (head == null || head.next == null) {
    	        return;
    	    }

    	    boolean swapped;
    	    Node current;
    	    Node nextNode;

    	    do {
    	        swapped = false;
    	        current = head;

    	        while (current.next != null) {
    	            nextNode = current.next;

    	            if (current.price > nextNode.price) {

    	                // swap data (easy way)
    	                int tempId = current.itemId;
    	                String tempName = current.itemName;
    	                int tempQty = current.quantity;
    	                double tempPrice = current.price;

    	                current.itemId = nextNode.itemId;
    	                current.itemName = nextNode.itemName;
    	                current.quantity = nextNode.quantity;
    	                current.price = nextNode.price;

    	                nextNode.itemId = tempId;
    	                nextNode.itemName = tempName;
    	                nextNode.quantity = tempQty;
    	                nextNode.price = tempPrice;

    	                swapped = true;
    	            }
    	            current = current.next;
    	        }
    	    } while (swapped);
    }
    
    //display the inventory items and price
    public void displayInventory()
    {
    	if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Node temp = head;

        System.out.println("----- Inventory List -----");
        while (temp != null) {
            System.out.println(
                "Item ID: " + temp.itemId +
                ", Name: " + temp.itemName +
                ", Quantity: " + temp.quantity +
                ", Price: " + temp.price
            );
            temp = temp.next;
        }
    }

}
