package com.mvpjava.guicetutorial.assisted;

import com.mvpjava.guicetutorial.assisted.exceptions.ProbeException;

public class Prober {

    public ProbeResult probe(Long flightID, String clearance) throws ProbeException {
        if (flightID == 0) {
            throw new ProbeException("Conflict detected");
        }
        return new ProbeResult();
    }

}
