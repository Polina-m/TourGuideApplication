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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_view, container, false);


        TextView titleTextView = rootView.findViewById(R.id.headerTextView);
        titleTextView.setText(R.string.category_museumsTitle);

        // Create a list of words
        ArrayList<Sight> museums = new ArrayList<Sight>();
        museums.add(new Sight(R.string.museum_ateneum,R.drawable.ateneum));
        museums.add(new Sight(R.string.museum_city,R.drawable.city));
        museums.add(new Sight(R.string.museum_design,R.drawable.design));
        museums.add(new Sight(R.string.museum_kiasma,R.drawable.kaisma));
        museums.add(new Sight(R.string.museum_national,R.drawable.ateneum));
        museums.add(new Sight(R.string.museum_naturalHistory,R.drawable.naturalhistory));
        museums.add(new Sight(R.string.museum_sinebrychoff, R.drawable.sinebryhoff));
        museums.add(new Sight(R.string.museum_university,R.drawable.uni));

        GridView mGridView = rootView.findViewById(R.id.gridview);
        mGridView.setAdapter(new GridSightAdapter(getActivity(), museums));


        return rootView;
    }

}
