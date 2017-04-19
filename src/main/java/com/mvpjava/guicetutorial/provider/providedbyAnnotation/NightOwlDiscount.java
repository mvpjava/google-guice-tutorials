package com.mvpjava.guicetutorial.provider.providedbyAnnotation;

public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35D;
    }
    
}
