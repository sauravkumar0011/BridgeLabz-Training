package com.trafficmanager;

public class Main {
    public static void main(String[] args) {

    	WaitingLine waitingQueue = new WaitingLine(3);
        Roundabout roundabout = new Roundabout();

        // Create vehicle objects
        Vehicle v1 = new Vehicle(101, "Car-A");
        Vehicle v2 = new Vehicle(102, "Car-B");
        Vehicle v3 = new Vehicle(103, "Car-C");
        Vehicle v4 = new Vehicle(104, "Car-D");

        // Enqueue vehicles (only numbers go into queue)
        waitingQueue.enqueue(v1.number);
        waitingQueue.enqueue(v2.number);
        waitingQueue.enqueue(v3.number);
        waitingQueue.enqueue(v4.number); // overflow

        System.out.println();

        // Dequeue vehicles and add to roundabout based on queue order
        for (int i = 0; i < 3; i++) {
            int dequeuedNumber = waitingQueue.dequeue();

            if (dequeuedNumber == v1.number) {
                roundabout.addVehicle(v1);
            } else if (dequeuedNumber == v2.number) {
                roundabout.addVehicle(v2);
            } else if (dequeuedNumber == v3.number) {
                roundabout.addVehicle(v3);
            }
        }

        // Display roundabout
        roundabout.displayRoundabout();
        System.out.println();

        // Vehicle exits
        roundabout.removeVehicle(v2);

        // Display again
        roundabout.displayRoundabout();
        System.out.println();

        // Remaining queue
        waitingQueue.displayQueue();
    }
}
