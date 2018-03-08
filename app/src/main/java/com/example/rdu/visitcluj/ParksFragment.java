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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Places list: Description, Address, Place Name, Image
        ArrayList<Place> places = new ArrayList<Place>();
        //NOTE I AM USING getString(R.string.xxx) because just R.string isn't working.
        places.add(new Place(getString(R.string.central_park_description),
                getString(R.string.central_park_address), getString(R.string.central_park_name), R.drawable.central_park));
        places.add(new Place(getString(R.string.botanical_garden_description),
                getString(R.string.botanical_garden_address), getString(R.string.botanical_garden_name), R.drawable.botanical_garden));
        places.add(new Place(getString(R.string.iulius_park_description),
                getString(R.string.iulius_park_address), getString(R.string.iulius_park_name), R.drawable.iulius_park));
        places.add(new Place(getString(R.string.rozelor_park_description),
                getString(R.string.rozelor_park_address), getString(R.string.rozelor_park_name), R.drawable.rozelor_park));
        places.add(new Place(getString(R.string.gheorgheni_park_description),
                getString(R.string.gheorgheni_park_address), getString(R.string.gheorgheni_park_name),
                R.drawable.gheorgheni_park));

        //create a new PlaceAdapter out of a list of places with a color ID.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.parks);

        //make a new object listView which finds the object list from the place_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);
        return rootView;
    }

}
