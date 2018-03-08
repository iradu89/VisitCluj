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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Places list: Description, Address, Place Name, Image
        ArrayList<Place> places = new ArrayList<Place>();
        //NOTE I AM USING getString(R.string.xxx) because just R.string isn't working.
        places.add(new Place(getString(R.string.michaels_church_description),
                getString(R.string.michaels_church_address), getString(R.string.michaels_church_name), R.drawable.michaels_church));
        places.add(new Place(getString(R.string.theotokos_cathedral_description),
                getString(R.string.theotokos_cathedral_address), getString(R.string.theotokos_cathedral_name), R.drawable.theotokos_cathedral));
        places.add(new Place(getString(R.string.franciscan_church_description),
                getString(R.string.franciscan_church_address), getString(R.string.franciscan_church_name), R.drawable.franciscan_church));
        places.add(new Place(getString(R.string.ethnografic_museum_description),
                getString(R.string.ethnografic_museum_address), getString(R.string.ethnografic_museum_name), R.drawable.ethnografic_museum));
        places.add(new Place(getString(R.string.pharmacy_museum_description),
                getString(R.string.pharmacy_museum_address), getString(R.string.pharmacy_museum_name), R.drawable.pharmacy_museum));
        places.add(new Place(getString(R.string.art_museum_description),
                getString(R.string.art_museum_address), getString(R.string.art_museum_name), R.drawable.art_museum));
        places.add(new Place(getString(R.string.observatory_description),
                getString(R.string.observatory_address), getString(R.string.observatory_name), R.drawable.observatory));

        //create a new PlaceAdapter out of a list of places with a color ID.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.history);

        //make a new object listView which finds the object list from the place_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);
        return rootView;
    }

}
