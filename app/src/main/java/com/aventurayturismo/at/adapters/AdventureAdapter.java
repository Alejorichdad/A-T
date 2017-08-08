package com.aventurayturismo.at.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.models.Adventure;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by willians on 8/8/17.
 */

public class AdventureAdapter extends RecyclerView.Adapter<AdventureAdapter.AdventureViewHolder>{

    private ArrayList<Adventure> items;
    Context context;
    private Intent intent;

    public class AdventureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;

        public AdventureViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.apulo);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();

            switch (getLayoutPosition()){
                case 0:
                    //intent = new Intent(context, NationalAlianceActivity.class);
                    //context.startActivity(intent);
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

    public AdventureAdapter(ArrayList<Adventure> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AdventureAdapter.AdventureViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adventure_card, viewGroup, false);
        return new AdventureAdapter.AdventureViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdventureAdapter.AdventureViewHolder viewHolder, int i) {
        Adventure currentItem = items.get(i);
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
