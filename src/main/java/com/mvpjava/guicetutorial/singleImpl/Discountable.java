package com.mvpjava.guicetutorial.singleImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)  
public interface Discountable {
    double getDiscount ();
}
