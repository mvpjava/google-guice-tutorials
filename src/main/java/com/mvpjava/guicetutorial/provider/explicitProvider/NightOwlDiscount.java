package com.mvpjava.guicetutorial.provider.explicitProvider;

import com.mvpjava.guicetutorial.provider.explicitProvider.Discountable;

public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35D;
    }
    
}
