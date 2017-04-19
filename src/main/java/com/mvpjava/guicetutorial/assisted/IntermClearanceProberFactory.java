package com.mvpjava.guicetutorial.assisted;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class IntermClearanceProberFactory {

    private final Provider<Prober> prober;
    
    @Inject
    public IntermClearanceProberFactory(Provider<Prober> prober){
        this.prober = prober;
    }
    
    public Clearable create(String clearance,Long flightID){
        return new ClearanceProber(clearance, flightID, prober.get());
    }
    
    //and would have to add binding with its interf ..
    //bind(IClearanceProberFactory.class).to(IntermClearanceProberFactory.class);

}
