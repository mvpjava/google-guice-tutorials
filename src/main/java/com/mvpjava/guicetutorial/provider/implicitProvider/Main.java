package com.mvpjava.guicetutorial.provider.implicitProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector();
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100.00D);
    }
}
