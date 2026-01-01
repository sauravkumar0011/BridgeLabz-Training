package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        //Hybrid inheritance demonstration
        Worker worker1 = new Chef("saurav", 101, "indian");
        Worker worker2 = new Waiter("Ritu", 102, 8);

        worker1.performDuties();
        System.out.println("---------------------");

        worker2.performDuties();
    }
}
