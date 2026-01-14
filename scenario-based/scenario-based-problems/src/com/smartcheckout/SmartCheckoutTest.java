package com.smartcheckout;

public class SmartCheckoutTest {

   public static void main(String[] args) {
	   
	   Inventory inventory = new Inventory();
		
	    inventory.addItemInventory("Milk", 50, 10);
	    inventory.addItemInventory("Bread", 30, 5);
	    inventory.addItemInventory("Eggs", 10, 20);
		
	    System.out.println();
	    
	    Customer c1 = new Customer(1, "Amit");
	    c1.addItem("Milk");
	    c1.addItem("Bread");

	    Customer c2 = new Customer(2, "Neha");
	    c2.addItem("Milk");
	    c2.addItem("Eggs");
	    c2.addItem("Eggs");

	    Customer c3 = new Customer(3, "Ravi");
	    c3.addItem("Bread");
	    
	    
	    CheckoutQueue queue = new CheckoutQueue(3);
	    
	    queue.enqueue(c1);
        queue.enqueue(c2);
        queue.enqueue(c3);
        
        System.out.println();

        //Billing process
        while(!queue.isEmpty()) {
        	
        	Customer currentCustomer = queue.dequeue();
        	System.out.println("Billing Customer: " + currentCustomer.name);
        	
        	int totalBill = 0;
        	
        	for(String item : currentCustomer.items)
        	{
        		if(inventory.isStockAvailable(item, 1))
        		{
        			int price = inventory.getPrice(item);
        			totalBill+=price;
        			inventory.updateStock(item, 1);
        		}
        		else {
        			System.out.println(item + "Out of stock");
        		}
        	}
        	
        	 System.out.println("Total Bill: ₹" + totalBill);
             System.out.println("--------------------------");
        	
        }
	    
           inventory.displayInventory();
   }   
}
