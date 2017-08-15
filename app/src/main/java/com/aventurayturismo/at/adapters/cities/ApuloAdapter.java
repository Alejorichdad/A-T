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
import android.widget.TextView;

import com.aventurayturismo.at.R;
import com.aventurayturismo.at.details.ApuloDetailActivity;
import com.aventurayturismo.at.fragments.anapoima.AnapoimaFragment;
import com.aventurayturismo.at.fragments.apulo.ApuloFragment;
import com.aventurayturismo.at.models.cities.Apulo;
import com.aventurayturismo.at.models.detail.DetailApulo;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by willians on 10/8/17.
 */

public class ApuloAdapter extends RecyclerView.Adapter<ApuloAdapter.ApuloViewHolder> {
    private ArrayList<Apulo> items;
    Context context;
    private Intent intent;
    ViewPager viewPager;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;
    public int image;

    public class ApuloViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;
        AppCompatActivity activity;
        ApuloFragment apuloFragment;
        AnapoimaFragment anapoimaFragment;

        public ApuloViewHolder (View v){
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
                    try {
                        title = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("title");
                        description = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("description");
                        phone = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("phone");
                        email = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("email");
                        coords = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("coords");
                        image = (int) DetailApulo.getDetailApulo().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ApuloDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 1:
                    try {
                        title = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("title");
                        description = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("description");
                        phone = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("phone");
                        email = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("email");
                        coords = (String) DetailApulo.getDetailApulo().getJSONObject("item1").get("coords");
                        image = (int) DetailApulo.getDetailApulo().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ApuloDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
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

    public ApuloAdapter(ArrayList<Apulo> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ApuloAdapter.ApuloViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.apulo_card, viewGroup, false);
        return new ApuloAdapter.ApuloViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ApuloAdapter.ApuloViewHolder viewHolder, int i) {
        Apulo currentItem = items.get(i);
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
