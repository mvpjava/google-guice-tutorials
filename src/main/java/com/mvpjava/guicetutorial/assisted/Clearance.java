package com.mvpjava.guicetutorial.assisted;

public class Clearance {

    private final String clearance;
    private final ProbeResult probeResult;

    public Clearance(String clearance, ProbeResult probeResult) {
        this.clearance = clearance;
        this.probeResult = probeResult;
    }

    public String getClearance() {
        return clearance;
    }

    public ProbeResult getProbeResult() {
        return probeResult;
    }
    
}
