
package com.mvpjava.guicetutorial.assisted;

import com.mvpjava.guicetutorial.assisted.exceptions.ClearanceException;
import com.google.inject.Inject;
import com.mvpjava.guicetutorial.assisted.ClearanceProber.ClearaceProberFactory;

public class ClearanceService {

    private final ClearaceProberFactory clearaceProberFactory;
    
    @Inject
    public ClearanceService(ClearaceProberFactory clearaceProberFactory) {
        this.clearaceProberFactory = clearaceProberFactory;
    }
    
    public Clearance requestClearance(String proposedClearance, FlightPlan flightPlan) throws ClearanceException
    {
        Clearable clearaceProber = clearaceProberFactory.create(proposedClearance, flightPlan.getFlightID());
        return clearaceProber.probeClearance();
    }
    
    //etc...
    
}
