package com.example.rdu.visitcluj;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Rdu on 28.09.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{

    //resource ID for background color
    private int mColorResourceId;

    //constructor
    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId){
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //gets the position of the current object in the list
        Place currentPlace = getItem(position);

        //find the TextView in the list_item.xml
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textview);
        //gets the description from the current object and sets it using setText
        descriptionTextView.setText(currentPlace.getDescription());

        //find the TextView in the list_item.xml
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_textview);
        //gets the address from the current object and sets it using setText
        addressTextView.setText(currentPlace.getAddress());

        //find the TextView in the list_item.xml
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name_textview);
        //gets the place name from the current object and sets it using setText
        nameTextView.setText(currentPlace.getPlaceName());

        //find the TextView in the list_item.xml
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //gets the image from the current object and sets it using setImageResource
        imageView.setImageResource(currentPlace.getImageResourceId());

        //sets the color for each list item
        View textContainer = listItemView.findViewById(R.id.place_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
