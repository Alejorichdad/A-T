package com.aventurayturismo.at.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.adapters.PlaceAdapter;
import com.aventurayturismo.at.models.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public PlaceFragment() {
        // Required empty public constructor
    }

    public static PlaceFragment newInstance() {
        PlaceFragment fragment = new PlaceFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_place, container, false);

        ArrayList<Place> items = new ArrayList<>();

        items.add(new Place(R.drawable.aventura, this.getString(R.string.apulo_title), this.getString(R.string.apulo_description)));
        items.add(new Place(R.drawable.bienestar1, this.getString(R.string.anapoima_title), this.getString(R.string.anapoima_description)));
        items.add(new Place(R.drawable.naturaleza, this.getString(R.string.tocaima_title), this.getString(R.string.tocaima_description)));
      //  items.add(new Place(R.drawable.lamesa, this.getString(R.string.lamesa_title), this.getString(R.string.lamesa_description)));

        RecyclerView recycler = (RecyclerView)v.findViewById(R.id.placeRecycler);
        recycler.setHasFixedSize(true);

        PlaceAdapter adapter = new PlaceAdapter(items);
        recycler.setAdapter(adapter);

        LinearLayoutManager layoutManager =  new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(layoutManager);

        return v;


    }

}
