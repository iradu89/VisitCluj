package com.example.rdu.visitcluj;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Places list: Description, Address, Place Name, Image
        ArrayList<Place> places = new ArrayList<Place>();
        //NOTE I AM USING getString(R.string.xxx) because just R.string isn't working.
        places.add(new Place(getString(R.string.iulius_mall_description),
                getString(R.string.iulius_mall_address), getString(R.string.iulius_mall_name), R.drawable.iulius_mall));
        places.add(new Place(getString(R.string.vivo_mall_description),
                getString(R.string.vivo_mall_address), getString(R.string.vivo_mall_name), R.drawable.vivo_mall));
        places.add(new Place(getString(R.string.platinia_description),
                getString(R.string.platinia_mall_address), getString(R.string.platinia_mall_name), R.drawable.platinia_mall));

        //create a new PlaceAdapter out of a list of places with a color ID.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.shopping);

        //make a new object listView which finds the object list from the place_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);
        return rootView;
    }
}
