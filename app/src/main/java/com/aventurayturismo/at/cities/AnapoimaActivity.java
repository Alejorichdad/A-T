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


    public static String titulo1 = "FINCA HOTEL VILLA CRISTINA";
    public static int imageFile1 = R.drawable.villa;
    public static String description1 = "Despertar con el dulce sonido de los pájaros el delicado olor de la naturaleza";

    public static String titulo2 = "PARAISO TERRENAL";
    public static int imageFile2 = R.drawable.paraisoterrenal;
    public static String description2 = "DONDE CONCENTRARSE A DESCANSAR";

    public static String titulo3 = "CENTRO COMERCIAL SAN JERÓNIMO";
    public static int imageFile3 = R.drawable.sanjero;
    public static String description3 = "DESTINO TURÍSTICO Y COMERCIAL";

    public static String titulo4 = "PUERTA TURÍSTICA LA MESA";
    public static int imageFile4 = R.drawable.puertaturistica;
    public static String description4 = "RESERVA YA TU PRÓXIMO DESTINO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anapoima);

        ArrayList<Anapoima> items = new ArrayList<>();

        items.add(new Anapoima(imageFile1, titulo1, description1));
        items.add(new Anapoima(imageFile2, titulo2, description2));
        items.add(new Anapoima(imageFile3, titulo3, description3));
        items.add(new Anapoima(imageFile4, titulo4, description4));


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
