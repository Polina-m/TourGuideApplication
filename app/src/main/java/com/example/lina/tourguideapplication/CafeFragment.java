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

/**
 * A simple {@link Fragment} subclass.
 */
public class CafeFragment extends Fragment {
    Intent intent;


    public CafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container,false);

        TextView titleTextView = rootView.findViewById(R.id.headerTextView);
        titleTextView.setText(R.string.category_cafeTitle);

        // Create a list of words
        final ArrayList<Sight> cafe = new ArrayList<>();
        cafe.add(new Sight(R.string.cafe_fazer, R.drawable.fazer_cafe, R.string.cafe_fazer_address,R.string.cafe_fazer_hours, R.string.cafe_fazer_about));
        cafe.add(new Sight(R.string.cafe_esplanad, R.drawable.esplanad_cafe, R.string.cafe_esplanad_address, R.string.cafe_esplanad_hours, R.string.cafe_esplanad_about));
        cafe.add(new Sight(R.string.cafe_brooklyn, R.drawable.brooklyn_cafe, R.string.cafe_brooklyn_address, R.string.cafe_brooklyn_hours, R.string.cafe_brooklyn_about));
        cafe.add(new Sight(R.string.cafe_aalto, R.drawable.aalto_cafe, R.string.cafe_aalto_address, R.string.cafe_aalto_hours, R.string.cafe_aalto_about));

        ListView mListView = rootView.findViewById(R.id.listview);
        mListView.setAdapter(new ListSightAdapter(getActivity(), cafe));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intent = new Intent(getActivity(), SightItemActivity.class);
                        intent.putExtra("Name", getString(cafe.get(position).getSightName()));
                        intent.putExtra("Address", getString(cafe.get(position).getSightAddress()));
                        intent.putExtra("Hours", getString(cafe.get(position).getSightOpenHours()));
                        intent.putExtra("Description", getString(cafe.get(position).getSightDescription()));
                        intent.putExtra("Img", cafe.get(position).getImageResourceId());
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getActivity(), SightItemActivity.class);
                        intent.putExtra("Name", getString(cafe.get(position).getSightName()));
                        intent.putExtra("Address", getString(cafe.get(position).getSightAddress()));
                        intent.putExtra("Hours", getString(cafe.get(position).getSightOpenHours()));
                        intent.putExtra("Description", getString(cafe.get(position).getSightDescription()));
                        intent.putExtra("Img", cafe.get(position).getImageResourceId());
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getActivity(), SightItemActivity.class);
                        intent.putExtra("Name", getString(cafe.get(position).getSightName()));
                        intent.putExtra("Address", getString(cafe.get(position).getSightAddress()));
                        intent.putExtra("Hours", getString(cafe.get(position).getSightOpenHours()));
                        intent.putExtra("Description", getString(cafe.get(position).getSightDescription()));
                        intent.putExtra("Img", cafe.get(position).getImageResourceId());
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getActivity(), SightItemActivity.class);
                        intent.putExtra("Name", getString(cafe.get(position).getSightName()));
                        intent.putExtra("Address", getString(cafe.get(position).getSightAddress()));
                        intent.putExtra("Hours", getString(cafe.get(position).getSightOpenHours()));
                        intent.putExtra("Description", getString(cafe.get(position).getSightDescription()));
                        intent.putExtra("Img", cafe.get(position).getImageResourceId());
                        startActivity(intent);
                        break;
                }
            }
        });



        return rootView;
    }

}
