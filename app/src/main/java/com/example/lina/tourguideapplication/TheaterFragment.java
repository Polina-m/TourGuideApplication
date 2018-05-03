package com.example.lina.tourguideapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheaterFragment extends Fragment {


    public TheaterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_view, container, false);

        TextView titleTextView = rootView.findViewById(R.id.headerTextView);
        titleTextView.setText(R.string.category_theatersTitle);

        // Create a list of words
        ArrayList<Sight> theaters = new ArrayList<Sight>();
        theaters.add(new Sight(R.string.theater_alexander,R.drawable.alexander));
        theaters.add(new Sight(R.string.theater_city,R.drawable.kaupunki));
        theaters.add(new Sight(R.string.theater_national,R.drawable.national));
        theaters.add(new Sight(R.string.theater_svenska,R.drawable.svenska));

        GridView mGridView = rootView.findViewById(R.id.gridview);
        mGridView.setAdapter(new GridSightAdapter(getActivity(), theaters));

        return rootView;
    }

}
