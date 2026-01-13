package com.callcenter;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.HashMap;

public class CallCenter {

	static Queue<Customer> cust  = new LinkedList<>();
	static PriorityQueue<Customer> pcust = new PriorityQueue<>((c1, c2) -> c1.id - c2.id);
	static HashMap<Integer,Integer> custInfo = new HashMap<>(); 
	
	
public void addCall(Customer c) {
		
		custInfo.put(c.id, custInfo.getOrDefault(c.id, 0) + 1);
		if(c.isVIP) {
			pcust.offer(c);
		}
		else {
			cust.offer(c);
		}
	}
	
    public void serveCall() {
		
    	if(!pcust.isEmpty()) {
			pcust.poll();
		}
		else {
			if(!cust.isEmpty())
			   cust.poll();
			else
				System.out.println("No any customer is in queue");
		}
	}
    
    public void showInfo()
    {
    	for (int c : custInfo.keySet()) {
            System.out.println("Customer ID: " + c +
                               ", Call Count: " + custInfo.get(c));
        }
    }
}
