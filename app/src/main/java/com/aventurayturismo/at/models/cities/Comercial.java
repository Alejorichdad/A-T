package com.aventurayturismo.at.models.cities;

/**
 * Created by willians on 10/8/17.
 */

public class Comercial {

    private int idImagen;
    private String titulo_imagen;
    private  String beneficio;

    public Comercial(int idImagen, String titulo_imagen, String beneficio){

        this.idImagen = idImagen;
        this.titulo_imagen = titulo_imagen;
        this.beneficio = beneficio;

    }


    public int getIdImagen(){
        return idImagen;
    }

    public String getTitulo_imagen(){
        return titulo_imagen;
    }
    public String getBeneficio(){
        return beneficio;
    }
}
