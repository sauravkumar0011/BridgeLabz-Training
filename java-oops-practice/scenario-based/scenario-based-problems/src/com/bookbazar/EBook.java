package com.bookbazar;

public class EBook extends Book{

	public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public double applyDiscount(int quantity) {
        return (price * quantity) * 0.8;
    }
}
