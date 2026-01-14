package com.smartcheckout;

public class CheckoutQueue {

    private Customer[] queue;
    private int front, rear, size, capacity;

    public CheckoutQueue(int capacity) {
        this.capacity = capacity;
        queue = new Customer[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add customer to queue
    public void enqueue(Customer c) {
        if (isFull()) {
            System.out.println("Queue Overflow: counter is full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = c;
        size++;

        System.out.println("Customer " + c.id + " added to waiting queue");
    }

    // Remove customer from queue
    public Customer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: No customer waiting");
            return null;
        }

        Customer customer = queue[front];
        front = (front + 1) % capacity;
        size--;

        return customer;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Display queue state
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Waiting queue is empty");
            return;
        }

        System.out.print("Waiting Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i].id + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
