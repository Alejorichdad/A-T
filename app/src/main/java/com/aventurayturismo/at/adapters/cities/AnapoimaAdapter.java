package com.aventurayturismo.at.adapters.cities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.fragments.anapoima.AnapoimaFragment;
import com.aventurayturismo.at.fragments.apulo.ApuloFragment;
import com.aventurayturismo.at.models.cities.Anapoima;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by willians on 10/8/17.
 */

public class AnapoimaAdapter extends RecyclerView.Adapter<AnapoimaAdapter.AnapoimaViewHolder> {
    private ArrayList<Anapoima> items;
    Context context;
    private Intent intent;
    ViewPager viewPager;

    public class AnapoimaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        AppCompatActivity activity;
        ApuloFragment apuloFragment;
        AnapoimaFragment anapoimaFragment;

        public AnapoimaViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.apulo);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();
            activity = (AppCompatActivity) v.getContext();
            switch (getLayoutPosition()){
                case 0:
                    Toast.makeText(v.getContext(),"DETALLE", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(v.getContext(),"DETALLE 2", Toast.LENGTH_SHORT).show();
                    break;
            }
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

    public AnapoimaAdapter(ArrayList<Anapoima> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AnapoimaAdapter.AnapoimaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.anapoima_card, viewGroup, false);
        return new AnapoimaAdapter.AnapoimaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnapoimaAdapter.AnapoimaViewHolder viewHolder, int i) {
        Anapoima currentItem = items.get(i);
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
