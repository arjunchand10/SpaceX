package com.arjunchand.spacex.models.RocketFolder.secondstage;

public class payloads {
    private String rocket_id;
    private boolean reused;
    private String nationality;
    private String manufacturer;
    private String payload_type;
    private String payload_mass_kgs;
    private String orbit;

    public String getRocket_id() {
        return rocket_id;
    }

    public boolean isReused() {
        return reused;
    }

    public String getNationality() {
        return nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPayload_type() {
        return payload_type;
    }

    public String getPayload_mass_kgs() {
        return payload_mass_kgs;
    }

    public String getOrbit() {
        return orbit;
    }
}
