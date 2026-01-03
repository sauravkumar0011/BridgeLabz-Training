package com.cabbygo;

public interface IRideService {
    
	void calculateFare(Double distance);
	void bookRide(String location);
	void endRide();
}
