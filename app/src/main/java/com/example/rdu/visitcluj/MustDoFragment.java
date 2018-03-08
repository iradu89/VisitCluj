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
public class MustDoFragment extends Fragment {


    public MustDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Places list: Description, Address, Place Name, Image
        ArrayList<Place> places = new ArrayList<Place>();
        //NOTE I AM USING getString(R.string.xxx) because just R.string isn't working.
        places.add(new Place(getString(R.string.cheile_turzii_description),
                getString(R.string.cheile_turzii_address), getString(R.string.cheile_turzii_name), R.drawable.cheile_turzii));
        places.add(new Place(getString(R.string.cetatuia_description),
                getString(R.string.cetatuia_address), getString(R.string.cetatuia_name), R.drawable.cetatuia));
        places.add(new Place(getString(R.string.salina_turda_description),
                getString(R.string.salina_turda_address), getString(R.string.salina_turda_name), R.drawable.salina_turda));
        places.add(new Place(getString(R.string.michaels_church_description),
                getString(R.string.michaels_church_address), getString(R.string.michaels_church_name), R.drawable.michaels_church));
        places.add(new Place(getString(R.string.king_matthias_description),
                getString(R.string.king_matthias_address), getString(R.string.king_matthias_name),
                R.drawable.king_matthias_corvin_statue));

        //create a new PlaceAdapter out of a list of places with a color ID.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.must_do);

        //make a new object listView which finds the object list from the place_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);

        return rootView;
    }

}
