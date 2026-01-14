package com.smartcheckout;

import java.util.HashMap;

public class Inventory {

	private HashMap<String,Integer> priceMap;
	private HashMap<String, Integer> stockMap;
	
	public Inventory() {
	        priceMap = new HashMap<>();
	        stockMap = new HashMap<>();
	}
	 
	public void addItemInventory(String name, int price, int stock) {
		priceMap.put(name, price);
		stockMap.put(name, stock);
	}
	
	public int getPrice(String name)
	{
		if(!priceMap.containsKey(name)) {
			System.out.println("Item not found: " + name);
            return -1;
		}
		
		return priceMap.get(name);
	}
	
	 public boolean isStockAvailable(String itemName, int quantity) {
	        if (!stockMap.containsKey(itemName)) {
	            System.out.println("Item not found: " + itemName);
	            return false;
	        }
	        return stockMap.get(itemName) >= quantity;
	 }

	 public void updateStock(String itemName, int quantity) {
	        if (stockMap.containsKey(itemName)) {
	            stockMap.put(itemName, stockMap.get(itemName) - quantity);
	        }
     }
	 
	 public void displayInventory() {
	        System.out.println("Inventory Status:");
	        for (String item : priceMap.keySet()) {
	            System.out.println(
	                item + " | Price: ₹" + priceMap.get(item)
	                + " | Stock: " + stockMap.get(item)
	            );
	        }
	 }
}
