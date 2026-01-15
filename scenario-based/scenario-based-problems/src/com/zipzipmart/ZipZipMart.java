package com.zipzipmart;

import java.time.LocalDate;

public class ZipZipMart {

	static void sortSales(Sale[] sales) {
        if (sales.length <= 1) return;

        int mid = sales.length / 2;

        Sale[] left = new Sale[mid];
        Sale[] right = new Sale[sales.length - mid];

        for (int i = 0; i < mid; i++) left[i] = sales[i];
        for (int i = mid; i < sales.length; i++) right[i - mid] = sales[i];

        sortSales(left);
        sortSales(right);

        merge(sales, left, right);
    }
	
	 static void merge(Sale[] sales, Sale[] left, Sale[] right) {
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            if (left[i].date.isBefore(right[j].date) ||
	                left[i].date.isEqual(right[j].date) && left[i].amount <= right[j].amount) {
	                sales[k++] = left[i++];
	            } else {
	                sales[k++] = right[j++];
	            }
	        }

	        while (i < left.length) sales[k++] = left[i++];
	        while (j < right.length) sales[k++] = right[j++];
	    }
	 
	public static void main(String[] args) {

		 Sale[] sales = {
		            new Sale(LocalDate.of(2025, 1, 12), 1500),
		            new Sale(LocalDate.of(2025, 1, 10), 900),
		            new Sale(LocalDate.of(2025, 1, 10), 900),
		            new Sale(LocalDate.of(2025, 1, 11), 1200),
		            new Sale(LocalDate.of(2025, 1, 12), 800)
		        };

		        sortSales(sales);

		        for (Sale s : sales) {
		            s.show();
		        }
		
	}

}
