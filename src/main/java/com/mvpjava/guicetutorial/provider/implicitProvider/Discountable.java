package com.mvpjava.guicetutorial.provider.implicitProvider;

import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    double getDiscount ();
}
