package com.fleetmanager;

import java.util.ArrayList;

public class Depot {

	private ArrayList<Vehicle> vehicleList;
	
	public Depot() {
		vehicleList = new ArrayList<>();
	}
	
	public void add(Vehicle v)
	{
		vehicleList.add(v);
	}
	
}
