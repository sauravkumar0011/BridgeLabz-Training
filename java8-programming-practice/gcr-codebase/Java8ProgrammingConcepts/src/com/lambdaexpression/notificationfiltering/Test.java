package com.lambdaexpression.notificationfiltering;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Alert> alerts = new ArrayList<>(List.of(new Alert("Emergency"),
		         new Alert("Info"),
		         new Alert("Medicine"),
		         new Alert("Info"),
		         new Alert("Medicine")));
		
		//Alerts only for emergency
		alerts.stream().filter(a -> a.type.equals("Emergency"))
		.forEach(a -> System.out.println(a.type));
		
		//Alerts only for Medicine 
		alerts.stream().filter(a -> a.type.equals("Medicine"))
		.forEach(a -> System.out.println(a.type));
	}

}
