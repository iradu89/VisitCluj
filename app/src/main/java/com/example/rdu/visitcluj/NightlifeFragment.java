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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Places list: Description, Address, Place Name, Image
        ArrayList<Place> places = new ArrayList<Place>();
        //NOTE I AM USING getString(R.string.xxx) because just R.string isn't working.
        places.add(new Place(getString(R.string.londoner_pub_description),
                getString(R.string.londoner_pub_address), getString(R.string.londoner_pub_name), R.drawable.londoner_pub));
        places.add(new Place(getString(R.string.flying_circus_pub_description),
                getString(R.string.flying_circus_pub_address), getString(R.string.flying_circus_pub_name), R.drawable.flying_circus_pub));
        places.add(new Place(getString(R.string.shto_bar_description),
                getString(R.string.shto_bar_address), getString(R.string.shto_bar_name), R.drawable.shto_bar));
        places.add(new Place(getString(R.string.bruno_wine_bar_description),
                getString(R.string.bruno_wine_bar_address), getString(R.string.bruno_wine_bar_name), R.drawable.bruno_wine_bar));
        places.add(new Place(getString(R.string.jazz_pub_description),
                getString(R.string.jazz_pub_address), getString(R.string.jazz_pub_name), R.drawable.jazz_pub));
        places.add(new Place(getString(R.string.noa_club_description),
                getString(R.string.noa_club_address), getString(R.string.noa_club_name), R.drawable.noa_club));

        //create a new PlaceAdapter out of a list of places with a color ID.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.nightlife);

        //make a new object listView which finds the object list from the place_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the adapter on listView
        listView.setAdapter(adapter);
        return rootView;
    }

}
