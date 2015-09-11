package com.example.garytang.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //ArrayList<String> foreCastEntry = new ArrayList<String>();
        //ArrayList populated with dummy forecast texts
        List<String> foreCastEntry = new ArrayList<String>(Arrays.asList("shit", "son", "this",
                "data","fake", "as", "hell", "jesus", "on", "loller", "skates"));

        ArrayAdapter<String> foreCastAdapter =
            new ArrayAdapter<String>(
                    //context - contains global info about app env, allows us to access system resources
                    getActivity(),
                    //ID of list item layout
                    R.layout.list_item_forecast,
                    //ID of text view to populate
                    R.id.list_item_forecast_textview,
                    //list of dummy data
                    foreCastEntry);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(foreCastAdapter);


        return rootView;
    }
}
