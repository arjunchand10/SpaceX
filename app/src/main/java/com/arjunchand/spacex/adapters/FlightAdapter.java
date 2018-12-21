package com.arjunchand.spacex.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.arjunchand.spacex.R;
import com.arjunchand.spacex.activities.InfoActivity;
import com.arjunchand.spacex.activities.MainActivity;
import com.arjunchand.spacex.activities.splashscreen;
import com.arjunchand.spacex.models.FlightDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.FlightViewHolder> {

    List<FlightDetails> flightDetails;
    private Context context;

    public FlightAdapter(List<FlightDetails> flightDetails, Context context) {
        this.flightDetails = flightDetails;
        this.context = context;
    }

    @NonNull
    @Override
    public FlightAdapter.FlightViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        FlightViewHolder evh = new FlightViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull FlightAdapter.FlightViewHolder flightViewHolder, final int i) {
        FlightDetails flight = flightDetails.get(i);

        flightViewHolder.tvHeading.setText(flight.getMission_name());
        flightViewHolder.tvDescription.setText(flight.getDetails());
        flightViewHolder.tvYear.setText( Integer.toString(flight.getLaunch_year()) );
        Picasso.get().load(flight.getLinks().getMission_patch_small()).into(flightViewHolder.mImageView);


        flightViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InfoActivity.class);
                intent.putExtra("id", i);
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return flightDetails.size();
    }

    public class FlightViewHolder  extends RecyclerView.ViewHolder {

        public TextView tvHeading;
        public TextView tvDescription;
        public TextView tvYear;
        public ImageView mImageView;

        public FlightViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeading = itemView.findViewById(R.id.missionnametv);
            tvDescription = itemView.findViewById(R.id.descriptiontv);
            tvYear = itemView.findViewById(R.id.launchdatetv);
            mImageView = itemView.findViewById(R.id.imageView2);



        }
    }
}
