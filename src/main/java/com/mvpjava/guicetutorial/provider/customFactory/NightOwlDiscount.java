package com.mvpjava.guicetutorial.provider.customFactory;

public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35D;
    }
    
}
