package com.example.lina.tourguideapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListSightAdapter extends ArrayAdapter<Sight>{

    public ListSightAdapter(@NonNull Context context, @NonNull ArrayList <Sight> cafes) {
        super(context, 0, cafes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Sight currentSight = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView sightNameTextView = (TextView) listItemView.findViewById(R.id.name_textView);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        sightNameTextView.setText(currentSight.getSightName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView sigtAddressTextView = (TextView) listItemView.findViewById(R.id.address_textView);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        sigtAddressTextView.setText(currentSight.getSightAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentSight.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
