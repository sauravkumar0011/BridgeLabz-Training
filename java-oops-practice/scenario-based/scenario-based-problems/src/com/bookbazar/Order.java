package com.bookbazar;

public class Order {

	private Book book;
    private int quantity;
    private boolean completed;

    public Order(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public void placeOrder() {
        if (book.updateStock(quantity)) {
            completed = true;
        }
    }

    public boolean isCompleted() {
        return completed;
    }
    
    public double getTotalCost() {
        return book.applyDiscount(quantity);
    }
}
