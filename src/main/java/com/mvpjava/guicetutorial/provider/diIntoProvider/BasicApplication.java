package com.mvpjava.guicetutorial.provider.diIntoProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class BasicApplication {

    private final CheckoutService checkoutService;

    @Inject
    public BasicApplication(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    void start() {
       checkoutService.checkout(100.0D);  
    }

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        BasicApplication application = guice.getInstance(BasicApplication.class);
        application.start();
    }
}
