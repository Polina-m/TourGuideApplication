package com.example.lina.tourguideapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ParkFragment extends Fragment {
    Intent intent;

    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container,false);

        TextView titleTextView = rootView.findViewById(R.id.headerTextView);
        titleTextView.setText(R.string.category_parkTitle);

        // Create a list of words
        final ArrayList<Sight> parks = new ArrayList<>();
        parks.add(new Sight(R.string.park_cherry, R.drawable.cherry_park, R.string.park_cherry_address,R.string.park_cherry_hours, R.string.park_cherry_about));
        parks.add(new Sight(R.string.park_alppiruusu, R.drawable.alppiruusupuisto_park, R.string.park_alppiruusu_address,R.string.park_alppiruusu_hours, R.string.park_alppiruusu_about));
        parks.add(new Sight(R.string.park_kaisaniemi, R.drawable.kaisaniemi_park, R.string.park_kaisaniemi_address,R.string.park_kaisaniemi_hours, R.string.park_kaisaniemi_about));

        ListView mListView = rootView.findViewById(R.id.listview);
        mListView.setAdapter(new ListSightAdapter(getActivity(), parks));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:
                    intent = new Intent(getActivity(), SightItemActivity.class);
                    intent.putExtra("Name", getString(parks.get(position).getSightName()));
                    intent.putExtra("Address", getString(parks.get(position).getSightAddress()));
                    intent.putExtra("Hours", getString(parks.get(position).getSightOpenHours()));
                    intent.putExtra("Description", getString(parks.get(position).getSightDescription()));
                    intent.putExtra("Img", parks.get(position).getImageResourceId());
                    startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(getActivity(), SightItemActivity.class);
                    intent.putExtra("Name", getString(parks.get(position).getSightName()));
                    intent.putExtra("Address", getString(parks.get(position).getSightAddress()));
                    intent.putExtra("Hours", getString(parks.get(position).getSightOpenHours()));
                    intent.putExtra("Description", getString(parks.get(position).getSightDescription()));
                    intent.putExtra("Img", parks.get(position).getImageResourceId());
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(getActivity(), SightItemActivity.class);
                    intent.putExtra("Name", getString(parks.get(position).getSightName()));
                    intent.putExtra("Address", getString(parks.get(position).getSightAddress()));
                    intent.putExtra("Hours", getString(parks.get(position).getSightOpenHours()));
                    intent.putExtra("Description", getString(parks.get(position).getSightDescription()));
                    intent.putExtra("Img", parks.get(position).getImageResourceId());
                    startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(getActivity(), SightItemActivity.class);
                    intent.putExtra("Name", getString(parks.get(position).getSightName()));
                    intent.putExtra("Address", getString(parks.get(position).getSightAddress()));
                    intent.putExtra("Hours", getString(parks.get(position).getSightOpenHours()));
                    intent.putExtra("Description", getString(parks.get(position).getSightDescription()));
                    intent.putExtra("Img", parks.get(position).getImageResourceId());
                    startActivity(intent);
                    break;
            }
        }
    });

        return rootView;
    }

}
