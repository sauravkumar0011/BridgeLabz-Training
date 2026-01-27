package com.dealtracker;

import java.util.*;

public class DealTrackApp {
	  public static void main(String[] args) throws Exception {

	        List<Deal> deals = DealReader.read("deals.txt");

	        Map<String,Deal> valid = DealManager.validDeals(deals);

	        List<Deal> sorted =
	                DealManager.sortByDiscount(valid.values());

	        System.out.println(valid);
	        System.out.println(sorted);
	    }
}
