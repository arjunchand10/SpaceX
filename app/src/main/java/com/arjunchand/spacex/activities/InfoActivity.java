package com.arjunchand.spacex.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.arjunchand.spacex.R;
import com.arjunchand.spacex.models.FlightDetails;
import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {


    public ImageView infoimg;
    public TextView nametv;
    public TextView yeartv;
    public TextView upcomingtv;
    public TextView rockettv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);



        Bundle extras = getIntent().getExtras();
        int index = -1;
        if (extras != null) {
            index = extras.getInt("id");

        }

        infoimg = findViewById(R.id.imageView3);
        nametv = findViewById(R.id.missionnametv);
        yeartv = findViewById(R.id.yeartv);
        upcomingtv = findViewById(R.id.upcomingtv);
        rockettv = findViewById(R.id.rockettv);

      FlightDetails flight = MainActivity.flightDetailsPublic.get(index);

      nametv.setText(flight.getMission_name());
      yeartv.setText(Integer.toString(flight.getLaunch_year()));
      upcomingtv.setText(Boolean.toString(flight.isUpcoming()));
      rockettv.setText("Rocket Name: " + flight.getRocket().getRocket_name() + "\n" + "Rocket Type: " + flight.getRocket().getRocket_type()
      + "\n");

        Picasso.get().load(flight.getLinks().getMission_patch_small()).into(infoimg);





    }
}
