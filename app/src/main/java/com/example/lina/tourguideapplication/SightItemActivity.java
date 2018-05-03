package com.example.lina.tourguideapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SightItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_item);

        Bundle bundle;
        bundle = getIntent().getExtras();

        TextView nameView = (TextView) findViewById(R.id.sightTitle);
        TextView addressView = (TextView) findViewById(R.id.sightAddress);
        TextView hoursView = (TextView) findViewById(R.id.sightOpenHours);
        TextView aboutView = (TextView) findViewById(R.id.sightDescription);
        ImageView imgView = (ImageView) findViewById(R.id.sightImage);

        // set values into views via intents
        nameView.setText(getIntent().getStringExtra("Name"));
        addressView.setText(getIntent().getStringExtra("Address"));
        hoursView.setText(getIntent().getStringExtra("Hours"));
        aboutView.setText(getIntent().getStringExtra("Description"));
        imgView.setImageResource(bundle.getInt("Img"));
    }
}
