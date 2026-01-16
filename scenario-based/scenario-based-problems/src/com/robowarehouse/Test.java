package com.robowarehouse;

public class Test {

	public static void main(String[] args) {
		
		RoboWarehouse robot = new RoboWarehouse();
		
		robot.loadPackage(10.0);
		robot.loadPackage(20.0);
		robot.loadPackage(15.0);
		robot.loadPackage(5.0);
		
		robot.displayShelf();

	}

}
