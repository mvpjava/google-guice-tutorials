package com.mvpjava.guicetutorial.provider.providesAnnotation;

//import com.google.inject.Provides;
import com.google.inject.Provides;
import java.time.LocalTime;

//import com.google.inject.Provides;
//import java.time.LocalTime;
public class DiscountGuiceModule extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        //bind(Discountable.class).toProvider(DiscountProvider.class);
        //removed DiscountProvider implementation from example
    }

    @Provides
    public Discountable get() {
        int hour = LocalTime.now().getHour();

        if (isEarlyMorning(hour)) {
            return new EarlyBirdDiscount();
        } else if (isLateAtNight(hour)) {
            return new NightOwlDiscount();
        }

        return new NoDiscount();
    }

    private boolean isEarlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }

}
