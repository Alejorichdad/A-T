package com.aventurayturismo.at.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.adapters.cities.ApuloAdapter;
import com.aventurayturismo.at.adapters.cities.ComercialAdapter;
import com.aventurayturismo.at.models.cities.Apulo;
import com.aventurayturismo.at.models.cities.Comercial;

import java.util.ArrayList;

public class ComercialActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static String titulo1 = "HELADOS EL PALACIO DEL COCO";
    public static int imageFile1 = R.drawable.helados;
    public static String description1 = "LOS MEJORES HELADOS Y PRODUCTOS DE COCO";

    public static String titulo2 = "PIZZA GOURMET";
    public static int imageFile2 = R.drawable.pizza;
    public static String description2 = "SERVICIO A DOMICILIOS";

    public static String titulo3 = "LOS MEJORES PLANES DE AVENTRA";
    public static int imageFile3 = R.drawable.aventura_logo;
    public static String description3 = "SENDERISMO, CAYONING, CUERDAS Y AVENTURA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comercial);


        ArrayList<Comercial> items = new ArrayList<>();

        items.add(new Comercial(imageFile1, titulo1, description1));
        items.add(new Comercial(imageFile2, titulo2, description2));
        items.add(new Comercial(imageFile3, titulo3, description3));

        recycler = (RecyclerView) findViewById(R.id.recyclerComercial);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new ComercialAdapter(items);
        recycler.setAdapter(adapter);
    }
}
