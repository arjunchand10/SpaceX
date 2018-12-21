package com.arjunchand.spacex.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.arjunchand.spacex.R;
import com.arjunchand.spacex.adapters.FlightAdapter;
import com.arjunchand.spacex.interfaces.SpaceXAPI;
import com.arjunchand.spacex.models.FlightDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public ProgressDialog progress;
    public static List<FlightDetails> flightDetailsPublic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.setIcon(R.drawable.applogo);
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setSecondaryProgress(0);
        progress.show();


                Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SpaceXAPI spaceXAPI = retrofit.create(SpaceXAPI.class);

        Call <List<FlightDetails>> call = spaceXAPI.getflightdetails();

        call.enqueue(new Callback<List<FlightDetails>>() {
            @Override
            public void onResponse(Call<List<FlightDetails>> call, Response<List<FlightDetails>> response) {
                List<FlightDetails>  flightDetails = response.body();
                flightDetailsPublic = flightDetails;


                mRecyclerView = findViewById(R.id.rview);

                mLayoutManager = new LinearLayoutManager(getApplicationContext());
                mAdapter = new FlightAdapter(flightDetails, getApplicationContext());

                mRecyclerView.setLayoutManager(mLayoutManager);
                mRecyclerView.setAdapter(mAdapter);

                progress.setSecondaryProgress(100);
                progress.dismiss();






            }

            @Override
            public void onFailure(Call<List<FlightDetails>> call, Throwable t) {
                System.out.println("-------------> " + t.getMessage());

            }
        });

    }

}
