package com.mvpjava.guicetutorial.singleImpl;

public class EarlyBirdDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.25;
    }

}
