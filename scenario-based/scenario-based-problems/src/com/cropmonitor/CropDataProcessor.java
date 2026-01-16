package com.cropmonitor;

import java.util.Arrays;

public class CropDataProcessor {

	    private long[] epochTimes;
	    private double[] soilTemps;

	    public CropDataProcessor(long[] epochTimes, double[] soilTemps) {
	        this.epochTimes = epochTimes;
	        this.soilTemps = soilTemps;
	    }

	    public void organize() {
	        if (epochTimes != null) {
	            executeSort(0, epochTimes.length - 1);
	        }
	    }
	    
	    private void executeSort(int start, int end) {
	        if (start >= end) return;
	        
	        int boundary = divide(start, end);
	        executeSort(start, boundary - 1);
	        executeSort(boundary + 1, end);
	    }

	    private int divide(int start, int end) {
	        long marker = epochTimes[start];
	        int left = start;

	        for (int right = start + 1; right <= end; right++) {
	            if (epochTimes[right] < marker) {
	                left++;
	                exchange(left, right);
	            }
	        }
	        exchange(start, left);
	        return left;
	    }
	    
	    private void exchange(int a, int b) {
	        long t1 = epochTimes[a];
	        epochTimes[a] = epochTimes[b];
	        epochTimes[b] = t1;

	        double t2 = soilTemps[a];
	        soilTemps[a] = soilTemps[b];
	        soilTemps[b] = t2;
	    }

	    public void printResults() {
	        System.out.println("Times: " + Arrays.toString(epochTimes));
	        System.out.println("Temps: " + Arrays.toString(soilTemps));
	    }
	    
}
