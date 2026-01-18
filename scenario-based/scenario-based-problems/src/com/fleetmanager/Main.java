package com.fleetmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		    List<Vehicle> depot1 = new ArrayList<>();
	        depot1.add(new Vehicle("V101", 12000));
	        depot1.add(new Vehicle("V102", 25000));
	        depot1.add(new Vehicle("V103", 40000));

	        List<Vehicle> depot2 = new ArrayList<>();
	        depot2.add(new Vehicle("V201", 15000));
	        depot2.add(new Vehicle("V202", 30000));
	        depot2.add(new Vehicle("V203", 45000));

	        List<Vehicle> depot3 = new ArrayList<>();
	        depot3.add(new Vehicle("V301", 10000));
	        depot3.add(new Vehicle("V302", 28000));
	        depot3.add(new Vehicle("V303", 50000));

	        List<List<Vehicle>> allDepots = new ArrayList<>();
	        allDepots.add(depot1);
	        allDepots.add(depot2);
	        allDepots.add(depot3);
	        

	        FleetManager manager = new FleetManager();
	        List<Vehicle> masterSchedule = manager.mergeAllDepots(allDepots);

	        manager.display(masterSchedule);
	}

}
