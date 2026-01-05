package com.linkedlist.singlylinkedlist.inventoryManagement;

public class InventoryTest {

	public static void main(String[] args) {
		
	InventoryManagement inventory = new InventoryManagement();
	
	 inventory.addAtEnd("Pen",255, 50, 10.0);
     inventory.addAtEnd("Notebook", 102, 30, 50.0);
     inventory.addAtbeginning( "Pencil", 103,100, 5.0);

     System.out.println("\nBefore Sorting:");
     inventory.displayInventory();
     
     //Sort by price (ascending)
     inventory.sortByItemPriceInAscendingOrder();
     
     System.out.println("\nAfter Sorting by Price (Ascending):");
     inventory.displayInventory();

     //Update quantity
     inventory.updateByItemId(102, 40);

     System.out.println("\nAfter Updating Quantity:");
     inventory.displayInventory();

     //Search item
     inventory.searchByItemId(255);

     //Total inventory value
     inventory.calculateAndDispalyTotalValue();
	}

}
