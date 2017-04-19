package com.mvpjava.guicetutorial.provider.diIntoProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Map;
import java.util.Random;

public class DiscountableProvider implements Provider<Discountable> {

    private final Random random;
    private final Map<Integer, Discountable > mapBinder;

    @Inject 
    public DiscountableProvider(Map<Integer, Discountable> mapBinder, Random random) {
        this.mapBinder = mapBinder;
        this.random = random;
    }

    @Override
    public Discountable get() {
        return mapBinder.get(random.nextInt(mapBinder.size()));
    }

}
