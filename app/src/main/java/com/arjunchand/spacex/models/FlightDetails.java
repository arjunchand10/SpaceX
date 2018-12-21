package com.arjunchand.spacex.models;

import com.arjunchand.spacex.models.RocketFolder.Rocket;
import com.google.gson.annotations.SerializedName;

public class FlightDetails {

    private int launch_year ;
    private double launch_date_unix;
    private boolean is_tentative;
    private Rocket rocket;
    @SerializedName("launch_site")
    private launch_site launchSite;
    private boolean launchsucess;
    private Links links;
    private String details;
    private boolean upcoming;
    private int flight_number;
    private String mission_name;

    public int getFlight_number() {
        return flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public int getLaunch_year() {
        return launch_year;
    }

    public double getLaunch_date_unix() {
        return launch_date_unix;
    }

    public boolean isIs_tentative() {
        return is_tentative;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public launch_site getLaunchSite() {
        return launchSite;
    }

    public boolean isLaunchsucess() {
        return launchsucess;
    }

    public Links getLinks() {
        return links;
    }

    public String getDetails() {
        return details;
    }

    public boolean isUpcoming() {
        return upcoming;
    }


}
