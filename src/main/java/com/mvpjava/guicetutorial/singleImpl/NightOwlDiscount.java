package com.mvpjava.guicetutorial.singleImpl;

public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35;
    }
    
}
