package com.arjunchand.spacex.interfaces;

import com.arjunchand.spacex.models.FlightDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpaceXAPI {

    @GET("launches")
    Call <List<FlightDetails>> getflightdetails();

}
