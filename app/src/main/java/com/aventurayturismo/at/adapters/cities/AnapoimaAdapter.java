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
import com.aventurayturismo.at.details.AnapoimaDetailActivity;
import com.aventurayturismo.at.fragments.anapoima.AnapoimaFragment;
import com.aventurayturismo.at.fragments.apulo.ApuloFragment;
import com.aventurayturismo.at.fragments.comercial.ComercialFragment;
import com.aventurayturismo.at.models.cities.Anapoima;
import com.aventurayturismo.at.models.detail.DetailAnapoima;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by willians on 10/8/17.
 */

public class  AnapoimaAdapter extends RecyclerView.Adapter<AnapoimaAdapter.AnapoimaViewHolder> {
    private ArrayList<Anapoima> items;
    Context context;
    private Intent intent;
    ViewPager viewPager;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;
    public int image;

    public class AnapoimaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;
        AppCompatActivity activity;
        ApuloFragment apuloFragment;
        AnapoimaFragment anapoimaFragment;
        ComercialFragment comercialFragment;

        public AnapoimaViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);
            idImagen = (ImageView) v.findViewById(R.id.anapoima);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();
            activity = (AppCompatActivity) v.getContext();
            switch (getLayoutPosition()){
                case 0:
                    try {
                        title = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("title");
                        description = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("description");
                        phone = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("phone");
                        email = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("email");
                        coords = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("coords");
                        image = (int) DetailAnapoima.getDetailAnapoima().getJSONObject("item1").get("image");


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AnapoimaDetailActivity.class);
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
                        title = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("title");
                        description = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("description");
                        phone = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("phone");
                        email = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("email");
                        coords = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("coords");
                        image = (int) DetailAnapoima.getDetailAnapoima().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AnapoimaDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 2:
                    try {
                        title = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("title");
                        description = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("description");
                        phone = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("phone");
                        email = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("email");
                        coords = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("coords");
                        image = (int) DetailAnapoima.getDetailAnapoima().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AnapoimaDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 3:
                    try {
                        title = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("title");
                        description = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("description");
                        phone = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("phone");
                        email = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("email");
                        coords = (String) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("coords");
                        image = (int) DetailAnapoima.getDetailAnapoima().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, AnapoimaDetailActivity.class);
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
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
