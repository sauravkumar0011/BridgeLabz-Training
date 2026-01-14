package com.trafficmanager;

public class WaitingLine {

	private int[] queue;
    private int front, rear, size, capacity;

    public WaitingLine(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(int vehicleId) {
        if (isFull()) {
            System.out.println("Queue Overflow: Entry gate is full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = vehicleId;
        size++;
        System.out.println("Vehicle " + vehicleId + " added to waiting queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return -1;
        }

        int vehicleId = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicleId;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Waiting queue is empty");
            return;
        }

        System.out.print("Waiting Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
