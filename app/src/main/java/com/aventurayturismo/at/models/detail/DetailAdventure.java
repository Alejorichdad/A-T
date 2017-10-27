package com.aventurayturismo.at.models.detail;

import com.aventurayturismo.at.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 27/8/17.
 */

public class DetailAdventure {
    public static JSONObject mainContentAdventure =  new JSONObject();
    public static JSONObject contentAdventure1 =  new JSONObject();
    public static JSONObject contentAdventure2 =  new JSONObject();
    public static JSONObject contentAdventure3 =  new JSONObject();
    public static JSONObject contentAdventure4 =  new JSONObject();

    /* DATA */

    public static String title1 = "Salto de Las Monjas";
    public static String description1 = "Una de las mas hermosas rutas del municipio de La Mesa, se encuentra ubicado en la inspección de policia de La Esperanza, no solo por la gran belleza de sus paisajes sino por su alto contenido histórico, cultural y natural. Transitando por sus caminos reales construidos en la epoca de la colonia para conectar ciudades como Facatativa con La Mesa, econtramos algunos atractivos muy importantes en esta espectacular ruta. La casa del expresidente Alfonso López, las ruinas de la antigua estación del tren que permitia transportar los granos de café hacia diversas partes del país, el río apulo y sus hermosas caidas, hasta llegar a la espectacular cascada conocida como el salto de las monjas en donde podremos disfrutar de la hermosa vista que nos proporciona y de un refrescante baño en sus pozos naturales. nota de: http://www.depaseo.com.co/";
    public static String phone1 = "3188319050";
    public static String email1 = "info@aventurayturismo.com";
    public static int imageFile1 = R.drawable.piscinas;
    public static String coords1 = "4.689968, -74.440387";


    public static String title2 = "Mirador de la mesa";
    public static String description2 = "Si eres amante a la naturaleza y fotografía, en la mesa podrás encontrar todo lo necesario para darte ese gusto tan especial, apreciar los amaneceres, disfrutar el atardecer y para los que gustan de la fotografía lograrán captar unas panoramicas asombrosas.  tienes dos miradores para tu deleite, mirador del Picacho y Mirador Del Rincón Santo";
    public static String phone2 = "3188319050";
    public static String email2 = "info@aventurayturismo.com";
    public static int imageFile2 = R.drawable.mirador;
    public static String coords2 = "4.626777, -74.461458";


    public static String title3 = "Arbol Ocobo";
    public static String description3 = "Tabebuia rosea, también llamado el árbol de trompeta de color, es un árbol nativo de los bosques tropófilos de la zona intertropical americana que crece hasta 30 m y pueden alcanzar un diámetro a la altura del pecho de hasta 100 cm, en La Mesa los puedes apreciar en diferentes colores y su exuberante belleza";
    public static String phone3 = "3188319050";
    public static String email3 = "info@aventurayturismo.com";
    public static int imageFile3 = R.drawable.ocobo_amarillo;
    public static String coords3 = "4.638288, -74.457947";


    public static String title4 = "Camino Real";
    public static String description4 = "Entre caminos reales como el camino real San Javier, camino real el Resbalón  podrá tener la sensacion de regresar al pasado mientras disfruta la naturaleza,  --- Por esos mismos caminos por los que en alguna época transitaron los indígenas y luego los españoles, por los que se transportó la sal, el oro, se inició el trueque entre tribus y por los que apenas se escuchaba el sonar de las herraduras de las mulas sobre las piedras duras, hoy se sienten los pasos y la respiración agitada de caminantes y turistas. --- nota del periodico el tiempo";
    public static String phone4 = "3188319050";
    public static String email4 = "info@aventurayturismo.com";
    public static int imageFile4 = R.drawable.camino_real;
    public static String coords4 = "4.638288, -74.457947";



    public static void addObjectsAdventure(){
        try {

            mainContentAdventure.put("item1", getFirstItemData());
            mainContentAdventure.put("item2", getSecItemData());
            mainContentAdventure.put("item3", getThirdItemData());
            mainContentAdventure.put("item4", getFourthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailAdventure(){
        addObjectsAdventure();
        return mainContentAdventure;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentAdventure1.put("title", title1);
        contentAdventure1.put("description", description1);
        contentAdventure1.put("phone", phone1);
        contentAdventure1.put("email", email1);
        contentAdventure1.put("image", imageFile1);
        contentAdventure1.put("coords", coords1);

        return contentAdventure1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentAdventure2.put("title", title2);
        contentAdventure2.put("description", description2);
        contentAdventure2.put("phone", phone2);
        contentAdventure2.put("email", email2);
        contentAdventure2.put("image", imageFile2);
        contentAdventure2.put("coords", coords2);

        return contentAdventure2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentAdventure3.put("title", title3);
        contentAdventure3.put("description", description3);
        contentAdventure3.put("phone", phone3);
        contentAdventure3.put("email", email3);
        contentAdventure3.put("image", imageFile3);
        contentAdventure3.put("coords", coords3);

        return contentAdventure3;
    }

    public static JSONObject getFourthItemData() throws JSONException {

        contentAdventure4.put("title", title4);
        contentAdventure4.put("description", description4);
        contentAdventure4.put("phone", phone4);
        contentAdventure4.put("email", email4);
        contentAdventure4.put("image", imageFile4);
        contentAdventure4.put("coords", coords4);

        return contentAdventure4;
    }
}
