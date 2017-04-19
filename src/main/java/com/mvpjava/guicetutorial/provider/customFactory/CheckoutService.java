package com.mvpjava.guicetutorial.provider.customFactory;

import com.google.inject.Inject;

public class CheckoutService {

    private final DiscountFactory discountFactory;
    
    @Inject
    public CheckoutService(DiscountFactory discountFactory) {      
        this.discountFactory = discountFactory;
    }

    public double checkout(ShoppingCart cart) {
        Discountable discountable = discountFactory.getDiscount(cart);
        double discount = discountable.getDiscount();
        double total = cart.getCartTotal();
        
        double totalAfterDiscount = total - (total * discount);
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
                total,
                discount * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }
}
