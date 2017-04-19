package com.mvpjava.guicetutorial.provider.providedbyAnnotation;

import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    double getDiscount ();
}
