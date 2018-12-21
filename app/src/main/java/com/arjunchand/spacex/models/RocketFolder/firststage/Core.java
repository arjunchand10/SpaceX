package com.arjunchand.spacex.models.RocketFolder.firststage;

public class Core {

    private String core_serial;
    private int flight;
    private int block;
    private boolean gridfins;
    private boolean legs;
    private boolean reused;
    private boolean land_success;
    private boolean landing_intent;
    private String landing_type;
    private boolean landing_vehicle;

    public String getCore_serial() {
        return core_serial;
    }

    public int getFlight() {
        return flight;
    }

    public int getBlock() {
        return block;
    }

    public boolean isGridfins() {
        return gridfins;
    }

    public boolean isLegs() {
        return legs;
    }

    public boolean isReused() {
        return reused;
    }

    public boolean isLand_success() {
        return land_success;
    }

    public boolean isLanding_intent() {
        return landing_intent;
    }

    public String getLanding_type() {
        return landing_type;
    }

    public boolean isLanding_vehicle() {
        return landing_vehicle;
    }
}