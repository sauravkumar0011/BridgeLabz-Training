package com.cropmonitor;

public class Test {

	public static void main(String[] args) {
		long[] logTimes = {18000L, 10000L, 186500L, 20520L};
		double[] readings = {24.5, 12.5, 85.5, 20.15};
		
		CropDataProcessor processor = new CropDataProcessor(logTimes, readings);
		processor.organize();
		processor.printResults();
	}
}
