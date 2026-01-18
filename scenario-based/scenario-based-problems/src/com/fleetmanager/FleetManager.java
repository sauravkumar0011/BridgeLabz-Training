package com.fleetmanager;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {	
	
	public List<Vehicle> mergeAllDepots(List<List<Vehicle>> depotLists)
	{
		if(depotLists == null || depotLists.isEmpty()) {
			return new ArrayList<>();
		}
		
		List<Vehicle> result = new ArrayList<>(depotLists.get(0));
		
		for(int i = 1; i<depotLists.size(); i++) {
			result = mergeTwoLists(result, depotLists.get(i));
		}
		
		return result;
	}
	
	private List<Vehicle> mergeTwoLists(List<Vehicle> list1, List<Vehicle> list2)
	{
		List<Vehicle> merged = new ArrayList<>();

		
		int i = 0;
		int j = 0;

		while (i < list1.size() && j < list2.size()) {

		    Vehicle v1 = list1.get(i);
		    Vehicle v2 = list2.get(j);

		    if (v1.getMileage() <= v2.getMileage()) {
		        merged.add(v1);
		        i++;
		    } else {
		        merged.add(v2);
		        j++;
		    }
		}
		
		while (i < list1.size()) {
		    merged.add(list1.get(i));
		    i++;
		}

		while (j < list2.size()) {
		    merged.add(list2.get(j));
		    j++;
		}
		
		return merged;
	}	
	
	public void display(List<Vehicle> list) {
		for(Vehicle v : list) {
			System.out.println("Id " + v.getId() + " Mileage " + v.getMileage());
		}
	}
}
