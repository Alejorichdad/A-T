package com.aventurayturismo.at.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.cities.AnapoimaActivity;
import com.aventurayturismo.at.cities.ApuloActivity;
import com.aventurayturismo.at.cities.ComercialActivity;
import com.aventurayturismo.at.cities.NaturalezaActivity;
import com.aventurayturismo.at.details.ApuloDetailActivity;
import com.aventurayturismo.at.fragments.anapoima.AnapoimaFragment;
import com.aventurayturismo.at.fragments.apulo.ApuloFragment;
import com.aventurayturismo.at.models.Place;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by willians on 7/8/17.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {
    private ArrayList<Place> items;
    Context context;
    private Intent intent;
    ViewPager viewPager;

    public class PlaceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;


        /*AppCompatActivity activity;
        ApuloFragment apuloFragment;
        AnapoimaFragment anapoimaFragment;*/


        public PlaceViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);
            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);
            idImagen = (ImageView) v.findViewById(R.id.apulo);

        }

        @Override
        public void onClick(View v) {
            switch (getLayoutPosition()){
                case 0:
                    intent = new Intent(context, ComercialActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(context, ApuloActivity.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(context, AnapoimaActivity.class);
                    context.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(context, NaturalezaActivity.class);
                    context.startActivity(intent);
                    break;

            }
        }

        public void setTitle(String title){
            titulo_imagen.setText(title);
        }

        public void setBenefit(String benefit){
            beneficio.setText(benefit);
        }

        public void setImage(int urlImg){
            //Log.e(context.toString(),"ssss");
            Picasso.with(context)
                    .load(urlImg)
                    .fit()
                    .centerCrop()
                    .into(idImagen);
        }
    }

    public PlaceAdapter(ArrayList<Place> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.place_card, viewGroup, false);
        return new PlaceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlaceViewHolder viewHolder, int i) {
        Place currentItem = items.get(i);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

}
