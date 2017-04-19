
package com.mvpjava.guicetutorial.toto;

import java.util.Random;

public class RandomDiscountSelector extends Random{

    private final int maxNumOfDiscountableImpl;

    public RandomDiscountSelector(int maxNumOfDiscountableImpl) {
        super();
        this.maxNumOfDiscountableImpl = maxNumOfDiscountableImpl;
    }

    @Override
    public int nextInt() {
        return super.nextInt(maxNumOfDiscountableImpl);
    }

}
