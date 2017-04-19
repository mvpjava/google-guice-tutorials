package com.mvpjava.guicetutorial.provider.customFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mvpjava.guicetutorial.provider.customFactory.DiscountGuiceModule.DiscountOption;
import static com.mvpjava.guicetutorial.provider.customFactory.DiscountGuiceModule.DiscountOption.*;
import java.util.Map;

@Singleton
public class CartDiscountFactory implements DiscountFactory{

    final Map<DiscountOption, Discountable> discountableBinder;

    @Inject
    public CartDiscountFactory(Map<DiscountOption, Discountable> mapBinder) {
        this.discountableBinder = mapBinder;
    }

    @Override
    public Discountable getDiscount(ShoppingCart cart) {
        int currentHour = cart.getTimeOfCheckout().getHour();
  
        if (isEarlyMorning(currentHour)) {
            return discountableBinder.get(EarlyBird);
        } else if (isLateAtNight(currentHour)) {
            return discountableBinder.get(NightOwl);
        }

        return discountableBinder.get(NoDiscount);
    }
    
    
    
    /********************************************************/
    /************************ PRIVATE ***********************/
    /********************************************************/
    
    private boolean isEarlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }
}
