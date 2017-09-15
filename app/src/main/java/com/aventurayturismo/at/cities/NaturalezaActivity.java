package com.aventurayturismo.at.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.adapters.AdventureAdapter;
import com.aventurayturismo.at.adapters.cities.AnapoimaAdapter;
import com.aventurayturismo.at.adapters.cities.NaturalezaAdapter;
import com.aventurayturismo.at.models.cities.Anapoima;
import com.aventurayturismo.at.models.cities.Naturaleza;

import java.util.ArrayList;

public class NaturalezaActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static String titulo1 = "Momentos";
    public static int imageFile1 = R.drawable.a0;
    public static String description1 = "";

    public static String titulo2 = "Momentos";
    public static int imageFile2 = R.drawable.a01;
    public static String description2 = "";

    public static String titulo3 = "Momentos";
    public static int imageFile3 = R.drawable.a2;
    public static String description3 = "";

    public static String titulo4 = "Momentos";
    public static int imageFile4 = R.drawable.a03;
    public static String description4 = "";

    public static String titulo5 = "Momentos";
    public static int imageFile5 = R.drawable.a04;
    public static String description5 = "";

    public static String titulo6 = "Momentos";
    public static int imageFile6 = R.drawable.a05;
    public static String description6 = "";

    public static String titulo7 = "Momentos";
    public static int imageFile7 = R.drawable.a06;
    public static String description7 = "";

    public static String titulo8 = "Momentos";
    public static int imageFile8 = R.drawable.a07;
    public static String description8 = "";

    public static String titulo9 = "Momentos";
    public static int imageFile9 = R.drawable.a1;
    public static String description9 = "";


    public static String titulo10 = "Momentos";
    public static int imageFile10 = R.drawable.a2;
    public static String description10 = "";

    public static String titulo11 = "Momentos";
    public static int imageFile11 = R.drawable.a4;
    public static String description11 = "";

    public static String titulo12 = "Momentos";
    public static int imageFile12 = R.drawable.a5;
    public static String description12 = "";

    public static String titulo13 = "Momentos";
    public static int imageFile13= R.drawable.a6;
    public static String description13 = "";

    public static String titulo14 = "Momentos";
    public static int imageFile14 = R.drawable.a7;
    public static String description14 = "";

    public static String titulo15 = "Momentos";
    public static int imageFile15 = R.drawable.a9;
    public static String description15 = "";

    public static String titulo16 = "Momentos";
    public static int imageFile16 = R.drawable.a10;
    public static String description16 = "";

    public static String titulo17 = "Momentos";
    public static int imageFile17 = R.drawable.a11;
    public static String description17 = "";

    public static String titulo18 = "Momentos";
    public static int imageFile18= R.drawable.a12;
    public static String description18 = "";

    public static String titulo19 = "Momentos";
    public static int imageFile19 = R.drawable.a13;
    public static String description19 = "";

    public static String titulo20 = "Momentos";
    public static int imageFile20 = R.drawable.a14;
    public static String description20 = "";

    public static String titulo21 = "Momentos";
    public static int imageFile21= R.drawable.a15;
    public static String description21 = "";


    public static String titulo22 = "Momentos";
    public static int imageFile22 = R.drawable.a18;
    public static String description22= "";

    public static String titulo23 = "Momentos";
    public static int imageFile23 = R.drawable.a19;
    public static String description23 = "";

    public static String titulo24 = "Momentos";
    public static int imageFile24 = R.drawable.a20;
    public static String description24 = "";

    public static String titulo25 = "Momentos";
    public static int imageFile25 = R.drawable.a21;
    public static String description25= "";

    public static String titulo26 = "Momentos";
    public static int imageFile26 = R.drawable.a22;
    public static String description26 = "";

    public static String titulo27 = "Momentos";
    public static int imageFile27 = R.drawable.a23;
    public static String description27 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturaleza);

        ArrayList<Naturaleza> items = new ArrayList<>();

        items.add(new Naturaleza(imageFile1, titulo1, description1));
        items.add(new Naturaleza(imageFile2, titulo2, description2));
        items.add(new Naturaleza(imageFile3, titulo3, description3));
        items.add(new Naturaleza(imageFile4, titulo4, description4));
        items.add(new Naturaleza(imageFile5, titulo5, description5));
        items.add(new Naturaleza(imageFile6, titulo6, description6));
        items.add(new Naturaleza(imageFile7, titulo7, description7));
        items.add(new Naturaleza(imageFile8, titulo8, description8));
        items.add(new Naturaleza(imageFile9, titulo9, description9));
        items.add(new Naturaleza(imageFile10, titulo10, description10));
        items.add(new Naturaleza(imageFile11, titulo11, description11));
        items.add(new Naturaleza(imageFile12, titulo12, description12));
        items.add(new Naturaleza(imageFile13, titulo13, description13));
        items.add(new Naturaleza(imageFile14, titulo14, description14));
        items.add(new Naturaleza(imageFile15, titulo15, description15));
        items.add(new Naturaleza(imageFile16, titulo16, description16));
        items.add(new Naturaleza(imageFile17, titulo17, description17));
        items.add(new Naturaleza(imageFile18, titulo18, description18));
        items.add(new Naturaleza(imageFile19, titulo19, description19));
        items.add(new Naturaleza(imageFile20, titulo20, description20));
        items.add(new Naturaleza(imageFile21, titulo21, description21));
        items.add(new Naturaleza(imageFile22, titulo22, description22));
        items.add(new Naturaleza(imageFile23, titulo23, description23));
        items.add(new Naturaleza(imageFile24, titulo24, description24));
        items.add(new Naturaleza(imageFile25, titulo25, description25));
        items.add(new Naturaleza(imageFile26, titulo26, description26));
        items.add(new Naturaleza(imageFile27, titulo27, description27));

        recycler = (RecyclerView) findViewById(R.id.recyclerNaturaleza);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);



        recycler.setLayoutManager(lManager);



        //Crear un nuevo adaptador
        adapter = new NaturalezaAdapter(items);
        recycler.setAdapter(adapter);
    }
}
