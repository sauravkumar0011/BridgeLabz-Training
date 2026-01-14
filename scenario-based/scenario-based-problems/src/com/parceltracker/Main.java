package com.parceltracker;

public class Main {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

       
        tracker.intializeStages();
        tracker.displayTracking();

    
        tracker.moveForward();
        tracker.moveForward();

    
        tracker.addCheckPoint("Shipped", "Customs Check");
        tracker.displayTracking();
        
        tracker.moveForward();
        tracker.moveForward();
        tracker.moveForward();
    }
}
