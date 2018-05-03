package com.example.lina.tourguideapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridSightAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Sight> mSight;

    public GridSightAdapter(Context context, ArrayList<Sight> sight){
        this.mContext = context;
        this.mSight = sight;
    }

    @Override
    public int getCount() {
        return mSight.size();
    }

    @Override
    public Object getItem(int position) {
        return mSight.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.grid_item, null);

            // pull views
            TextView nameView = (TextView) gridView
                    .findViewById(R.id.placeName);
            ImageView imgView = (ImageView) gridView
                    .findViewById(R.id.placeImage);

            // set values into views
            nameView.setText(mSight.get(position).getSightName());
            imgView.setImageResource(mSight.get(position).getImageResourceId());

        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
