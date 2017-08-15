package com.aventurayturismo.at.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.adapters.cities.ApuloAdapter;
import com.aventurayturismo.at.models.cities.Apulo;

import java.util.ArrayList;

public class ApuloActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static String titulo1 = "item title national 1";
    public static int imageFile1 = R.drawable.apulo;
    public static String description1 = "item description national 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apulo);


        ArrayList<Apulo> items = new ArrayList<>();

        items.add(new Apulo(imageFile1, titulo1, description1));

        recycler = (RecyclerView) findViewById(R.id.recyclerApulo);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new ApuloAdapter(items);
        recycler.setAdapter(adapter);
    }
}
