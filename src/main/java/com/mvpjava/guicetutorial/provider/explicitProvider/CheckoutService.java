package com.mvpjava.guicetutorial.provider.explicitProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CheckoutService {

    private final Discountable discountable;
    //private final Provider<Discountable> discountable;

    @Inject
    public CheckoutService(Discountable discountable) {      
    //public CheckoutService(Provider<Discountable> discountable) {

        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        double discount = discountable.getDiscount();
       //double discount = discountable.get().getDiscount();

        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discount);
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
                shoppingCartTotal,
                discount * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }
}
