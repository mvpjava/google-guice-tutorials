package com.mvpjava.guicetutorial.provider.customFactory;

import com.google.inject.multibindings.MapBinder;
import static com.mvpjava.guicetutorial.provider.customFactory.DiscountGuiceModule.DiscountOption.*;

public class DiscountGuiceModule extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        MapBinder<DiscountOption, Discountable> mapBinder
                = MapBinder.newMapBinder(binder(), DiscountOption.class, Discountable.class);

        mapBinder.addBinding(EarlyBird).to(EarlyBirdDiscount.class);
        mapBinder.addBinding(NightOwl).to(NightOwlDiscount.class);
        mapBinder.addBinding(NoDiscount).to(NoDiscount.class);
    }

    public enum DiscountOption {
        EarlyBird, NightOwl, NoDiscount;
    }
}
