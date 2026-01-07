package com.parkease;

public class ParkingManager {

    private String[] bookingLogs = new String[10];
    private int index = 0;

    public void addLog(String log) {
        bookingLogs[index++] = log;
    }

    public void showLogs() {
        for (int i = 0; i < index; i++) {
            System.out.println(bookingLogs[i]);
        }
    }
}
