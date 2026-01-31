package com.lambdaexpression.smarthomelighting;

public class Test {

	 public static void main(String[] args) {
		 
		 SmartLightSystem system = new SmartLightSystem();
		 
		 //motion sensor
		 system.trigeer(()-> System.out.println("Light On full bright"));
		 
		 //night behaviour
		 system.trigeer(()-> System.out.println("Light On dim"));

		 //voice command behaviour
		 system.trigeer(()-> System.out.println("Light On colorful"));

		 
		 
	 }
}
