/*
CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers. 
*/

package com.callcenter;

public class CallCenterTest {

	public static void main(String[] args) {
		
		CallCenter center = new CallCenter();
		
		Customer c1 = new Customer(101, "Saurav", false);
		Customer c2 = new Customer(102, "vishal", false);
		Customer c3 = new Customer(103, "ravi", false);
		Customer c4 = new Customer(104, "shivam", true);
		
		
		center.addCall(c1);
        center.addCall(c2);
        center.addCall(c3);
        center.addCall(c4);
        center.addCall(c4);
        
        center.serveCall();
        center.serveCall();
        center.serveCall();
        center.serveCall();
        center.serveCall();

        center.showInfo();
	}

}
