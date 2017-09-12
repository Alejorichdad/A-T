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
import com.aventurayturismo.at.adventure_details.AdventureDetailActivity;
import com.aventurayturismo.at.models.Adventure;
import com.aventurayturismo.at.models.detail.DetailAdventure;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by willians on 8/8/17.
 */

public class AdventureAdapter extends RecyclerView.Adapter<AdventureAdapter.AdventureViewHolder>{
    private ArrayList<Adventure> items;
    Context context;
    private Intent intent;
    ViewPager viewPager;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;
    public int image;

    public class AdventureViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item

        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;
        AppCompatActivity activity;


        public AdventureViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);
            idImagen = (ImageView) v.findViewById(R.id.apulo);


        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();
            activity = (AppCompatActivity) v.getContext();
            switch (getLayoutPosition()){
                case 0:
                    try {
                        title = (String) DetailAdventure.getDetailAdventure().getJSONObject("item1").get("title");
                        description = (String) DetailAdventure.getDetailAdventure().getJSONObject("item1").get("description");
                        image = (int) DetailAdventure.getDetailAdventure().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AdventureDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 1:
                    try {
                        title = (String) DetailAdventure.getDetailAdventure().getJSONObject("item2").get("title");
                        description = (String) DetailAdventure.getDetailAdventure().getJSONObject("item2").get("description");
                        image = (int) DetailAdventure.getDetailAdventure().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AdventureDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 2:
                    try {
                        title = (String) DetailAdventure.getDetailAdventure().getJSONObject("item3").get("title");
                        description = (String) DetailAdventure.getDetailAdventure().getJSONObject("item3").get("description");
                        image = (int) DetailAdventure.getDetailAdventure().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AdventureDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 3:
                    try {
                        title = (String) DetailAdventure.getDetailAdventure().getJSONObject("item4").get("title");
                        description = (String) DetailAdventure.getDetailAdventure().getJSONObject("item4").get("description");
                        image = (int) DetailAdventure.getDetailAdventure().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AdventureDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("image", image);
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
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
