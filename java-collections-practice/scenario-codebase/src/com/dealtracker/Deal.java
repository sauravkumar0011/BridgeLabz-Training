package com.dealtracker;
 
import java.time.*;

public class Deal extends Promotion<Integer>{

	    int minimumPurchase;

	    public Deal(String code, int discount, int min, LocalDate till) {
	        super(code, discount, till);
	        this.minimumPurchase = min;
	    }
}
