package com.parkease;

public class ParkingEaseTest {

	public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot(101, "Zone A", "Car");
        Vehicle car = new Car();
        ParkingManager manager = new ParkingManager();

        if (slot.assignSlot()) {
            double charges = car.calculateCharges(6);
            manager.addLog("Slot 101 booked. Charges: " + charges);
            slot.releaseSlot();
        }

        manager.showLogs();
    }
}
