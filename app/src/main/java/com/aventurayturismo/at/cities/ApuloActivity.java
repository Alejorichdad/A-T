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

    public static String titulo1 = "PARQUE MAKUTE";
    public static int imageFile1 = R.drawable.makute;
    public static String description1 = "AVENTURA EXPERIENCIAL DIRIGIDO A GRUPOS Y ORGANIZACIONES ";

    public static String titulo2 = "WUAIRA CUATRIPASEOS";
    public static int imageFile2 = R.drawable.wuaira;
    public static String description2 = "CUATRIMOTOS, FATBIKES, CABALLOS, CAMINATAS, CUERDAS, AVISTAMIENTO, CULTURA, etc...";

    public static String titulo3 = "MACADAMIA BOSQUE AVENTURA";
    public static int imageFile3 = R.drawable.macadamia;
    public static String description3 = "EXPERTOS EN DEPORTE DE AVENTURA Y EDUCACIÓN MEDIO AMBIENTAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apulo);


        ArrayList<Apulo> items = new ArrayList<>();

        items.add(new Apulo(imageFile1, titulo1, description1));
        items.add(new Apulo(imageFile2, titulo2, description2));
        items.add(new Apulo(imageFile3, titulo3, description3));

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
