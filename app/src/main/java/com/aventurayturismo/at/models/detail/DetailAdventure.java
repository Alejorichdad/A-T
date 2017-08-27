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

    /* DATA */

    public static String title1 = "adventure1";
    public static String description1 = "adventure description bla description1";
    public static String phone1 = "12344567";
    public static String email1 = "some@gmail.com";
    public static int imageFile1 = R.drawable.anapoima;
    public static String coords1 = "37.7749,-122.4194";

    public static String title2 = "adventure2";
    public static String description2 = "adventure description2";
    public static String phone2 = "22344567";
    public static String email2 = "some@gmail.com";
    public static int imageFile2 = R.drawable.anapoima;
    public static String coords2 = "37.7749,-122.4194";



    public static void addObjectsAdventure(){
        try {

            mainContentAdventure.put("item1", getFirstItemData());
            mainContentAdventure.put("item2", getSecItemData());
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
}
