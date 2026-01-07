package com.bookbazar;

public class Book implements IDiscountable{

	 private String title;
	    private String author;
	    protected double price;
	    private int stock;

	    public Book(String title, String author, double price, int stock) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.stock = stock;
	    }

	    public Book(String title, String author, double price, int stock, boolean offer) {
	        this(title, author, price, stock);
	        if (offer) this.price = price * 0.9;
	    }

	    public boolean updateStock(int qty) {
	        if (stock >= qty) {
	            stock -= qty;
	            return true;
	        }
	        return false;
	    }

	    public double applyDiscount(int quantity) {
	        return price * quantity;
	    }
}
