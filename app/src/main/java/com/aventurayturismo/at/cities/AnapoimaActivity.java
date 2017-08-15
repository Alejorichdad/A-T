package com.aventurayturismo.at.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.adapters.cities.AnapoimaAdapter;
import com.aventurayturismo.at.models.cities.Anapoima;

import java.util.ArrayList;

public class AnapoimaActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static String titulo1 = "item title national 1";
    public static int imageFile1 = R.drawable.anapoima;
    public static String description1 = "item description national 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anapoima);

        ArrayList<Anapoima> items = new ArrayList<>();

        items.add(new Anapoima(imageFile1, titulo1, description1));
        items.add(new Anapoima(imageFile1, titulo1, description1));
        items.add(new Anapoima(imageFile1, titulo1, description1));
        items.add(new Anapoima(imageFile1, titulo1, description1));

        recycler = (RecyclerView) findViewById(R.id.recyclerAnapoima);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new AnapoimaAdapter(items);
        recycler.setAdapter(adapter);
    }
}
