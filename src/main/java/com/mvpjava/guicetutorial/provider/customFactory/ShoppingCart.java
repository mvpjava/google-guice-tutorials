
package com.mvpjava.guicetutorial.provider.customFactory;

import java.time.LocalTime;


public class ShoppingCart {
   private LocalTime timeOfCheckout;
   private double cartTotal;

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public LocalTime getTimeOfCheckout() {
        return timeOfCheckout;
    }

    public void setTimeOfCheckout(LocalTime timeOfCheckout) {
        this.timeOfCheckout = timeOfCheckout;
    }

}
