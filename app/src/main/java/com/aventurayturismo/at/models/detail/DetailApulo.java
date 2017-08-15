package com.aventurayturismo.at.models.detail;

import com.aventurayturismo.at.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 15/8/17.
 */

public class DetailApulo {

    public static JSONObject mainContentApulo =  new JSONObject();
    public static JSONObject contentApulo1 =  new JSONObject();
    public static JSONObject contentApulo2 =  new JSONObject();
    public static JSONObject contentApulo3 =  new JSONObject();
    public static JSONObject contentApulo4 =  new JSONObject();
    public static JSONObject contentApulo5 =  new JSONObject();
    public static JSONObject contentApulo6 =  new JSONObject();
    public static JSONObject contentApulo7 =  new JSONObject();
    public static JSONObject contentApulo8 =  new JSONObject();
    public static JSONObject contentApulo9 =  new JSONObject();
    public static JSONObject contentApulo10 =  new JSONObject();
    public static JSONObject contentApulo11 =  new JSONObject();
    public static JSONObject contentApulo12 =  new JSONObject();
    public static JSONObject contentApulo13 =  new JSONObject();
    public static JSONObject contentApulo14 =  new JSONObject();
    public static JSONObject contentApulo15 =  new JSONObject();

    /* DATA */

    public static String title1 = "titulo1";
    public static String description1 = "description1";
    public static String phone1 = "12344567";
    public static String email1 = "some@gmail.com";
    public static int imageFile1 = R.drawable.apulo;
    public static String coords1 = "37.7749,-122.4194";

    public static String title2 = "titulo2";
    public static String description2 = "description2";
    public static String phone2 = "22344567";
    public static String email2 = "some@gmail.com";
    public static int imageFile2 = R.drawable.apulo;
    public static String coords2 = "37.7749,-122.4194";

    public static String title3 = "titulo3";
    public static String description3 = "description3";
    public static String phone3 = "3344567";
    public static String email3 = "some@gmail.com";
    public static int imageFile3 = R.drawable.apulo;
    public static String coords3 = "37.7749,-122.4194";

    public static String title4 = "titulo4";
    public static String description4 = "description4";
    public static String phone4 = "444567";
    public static String email4 = "some@gmail.com";
    public static int imageFile4 = R.drawable.apulo;
    public static String coords4 = "37.7749,-122.4194";

    public static String title5 = "titulo5";
    public static String description5 = "description5";
    public static String phone5 = "544567";
    public static String email5 = "some@gmail.com";
    public static int imageFile5 = R.drawable.apulo;
    public static String coords5 = "37.7749,-122.4194";

    public static String title6 = "titulo6";
    public static String description6 = "description6";
    public static String phone6 = "644567";
    public static String email6 = "some@gmail.com";
    public static int imageFile6 = R.drawable.apulo;
    public static String coords6 = "37.7749,-122.4194";

    public static String title7 = "titulo7";
    public static String description7 = "description7";
    public static String phone7 = "744567";
    public static String email7 = "some@gmail.com";
    public static int imageFile7 = R.drawable.apulo;
    public static String coords7 = "37.7749,-122.4194";

    public static String title8 = "titulo8";
    public static String description8 = "description8";
    public static String phone8 = "844567";
    public static String email8 = "some@gmail.com";
    public static int imageFile8 = R.drawable.apulo;
    public static String coords8 = "37.7749,-122.4194";

    public static String title9 = "titulo9";
    public static String description9 = "description9";
    public static String phone9 = "944567";
    public static String email9 = "some@gmail.com";
    public static int imageFile9 = R.drawable.apulo;
    public static String coords9 = "37.7749,-122.4194";

    public static String title10 = "titulo10";
    public static String description10 = "description10";
    public static String phone10 = "1044567";
    public static String email10 = "some@gmail.com";
    public static int imageFile10 = R.drawable.apulo;
    public static String coords10 = "37.7749,-122.4194";

    public static String title11 = "titulo11";
    public static String description11 = "description11";
    public static String phone11 = "1144567";
    public static String email11 = "some@gmail.com";
    public static int imageFile11 = R.drawable.apulo;
    public static String coords11 = "37.7749,-122.4194";

    public static String title12 = "titulo12";
    public static String description12 = "description12";
    public static String phone12 = "1244567";
    public static String email12 = "some@gmail.com";
    public static int imageFile12 = R.drawable.apulo;
    public static String coords12 = "37.7749,-122.4194";

    public static String title13 = "titulo13";
    public static String description13 = "description13";
    public static String phone13 = "1344567";
    public static String email13 = "some@gmail.com";
    public static int imageFile13 = R.drawable.apulo;
    public static String coords13 = "37.7749,-122.4194";

    public static String title14 = "titulo14";
    public static String description14 = "description14";
    public static String phone14 = "1444567";
    public static String email14 = "some@gmail.com";
    public static int imageFile14 = R.drawable.apulo;
    public static String coords14 = "37.7749,-122.4194";

    public static String title15 = "titulo15";
    public static String description15 = "description15";
    public static String phone15 = "1544567";
    public static String email15 = "some@gmail.com";
    public static int imageFile15 = R.drawable.apulo;
    public static String coords15 = "37.7749,-122.4194";


    public static void addObjectsApulo(){
        try {

            mainContentApulo.put("item1", getFirstItemData());
            mainContentApulo.put("item2", getSecItemData());
            mainContentApulo.put("item3", getThirdItemData());
            mainContentApulo.put("item4", getFourItemData());
            mainContentApulo.put("item5", getFifthItemData());
            mainContentApulo.put("item6", getSixthItemData());
            mainContentApulo.put("item7", getSevenththItemData());
            mainContentApulo.put("item8", getEighthItemData());
            mainContentApulo.put("item9", getNinthItemData());
            mainContentApulo.put("item10", getTenthItemData());
            mainContentApulo.put("item11", getEleventhItemData());
            mainContentApulo.put("item12", getTwelvethItemData());
            mainContentApulo.put("item13", getThirdteenthItemData());
            mainContentApulo.put("item14", getFourteenthItemData());
            mainContentApulo.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailApulo(){
        addObjectsApulo();
        return mainContentApulo;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentApulo1.put("title", title1);
        contentApulo1.put("description", description1);
        contentApulo1.put("phone", phone1);
        contentApulo1.put("email", email1);
        contentApulo1.put("image", imageFile1);
        contentApulo1.put("coords", coords1);

        return contentApulo1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentApulo2.put("title", title2);
        contentApulo2.put("description", description2);
        contentApulo2.put("phone", phone2);
        contentApulo2.put("email", email2);
        contentApulo2.put("image", imageFile2);
        contentApulo2.put("coords", coords2);

        return contentApulo2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentApulo3.put("title", title3);
        contentApulo3.put("description", description3);
        contentApulo3.put("phone", phone3);
        contentApulo3.put("email", email3);
        contentApulo3.put("image", imageFile3);
        contentApulo3.put("coords", coords3);

        return contentApulo3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentApulo4.put("title", title4);
        contentApulo4.put("description", description4);
        contentApulo4.put("phone", phone4);
        contentApulo4.put("email", email4);
        contentApulo4.put("image", imageFile4);
        contentApulo4.put("coords", coords4);

        return contentApulo4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentApulo5.put("title", title5);
        contentApulo5.put("description", description5);
        contentApulo5.put("phone", phone5);
        contentApulo5.put("email", email5);
        contentApulo5.put("image", imageFile5);
        contentApulo5.put("coords", coords5);

        return contentApulo5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentApulo6.put("title", title6);
        contentApulo6.put("description", description6);
        contentApulo6.put("phone", phone6);
        contentApulo6.put("email", email6);
        contentApulo6.put("image", imageFile6);
        contentApulo6.put("coords", coords6);

        return contentApulo6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentApulo7.put("title", title7);
        contentApulo7.put("description", description7);
        contentApulo7.put("phone", phone7);
        contentApulo7.put("email", email7);
        contentApulo7.put("image", imageFile7);
        contentApulo7.put("coords", coords7);

        return contentApulo7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentApulo8.put("title", title8);
        contentApulo8.put("description", description8);
        contentApulo8.put("phone", phone8);
        contentApulo8.put("email", email8);
        contentApulo8.put("image", imageFile8);
        contentApulo8.put("coords", coords8);

        return contentApulo8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentApulo9.put("title", title9);
        contentApulo9.put("description", description9);
        contentApulo9.put("phone", phone9);
        contentApulo9.put("email", email9);
        contentApulo9.put("image", imageFile9);
        contentApulo9.put("coords", coords9);

        return contentApulo9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentApulo10.put("title", title10);
        contentApulo10.put("description", description10);
        contentApulo10.put("phone", phone10);
        contentApulo10.put("email", email10);
        contentApulo10.put("image", imageFile10);
        contentApulo10.put("coords", coords10);

        return contentApulo10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentApulo11.put("title", title11);
        contentApulo11.put("description", description11);
        contentApulo11.put("phone", phone11);
        contentApulo11.put("email", email11);
        contentApulo11.put("image", imageFile11);
        contentApulo11.put("coords", coords11);

        return contentApulo11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentApulo12.put("title", title12);
        contentApulo12.put("description", description12);
        contentApulo12.put("phone", phone12);
        contentApulo12.put("email", email12);
        contentApulo12.put("image", imageFile12);
        contentApulo12.put("coords", coords12);

        return contentApulo12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentApulo13.put("title", title13);
        contentApulo13.put("description", description13);
        contentApulo13.put("phone", phone13);
        contentApulo13.put("email", email13);
        contentApulo13.put("image", imageFile13);
        contentApulo13.put("coords", coords13);

        return contentApulo13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentApulo14.put("title", title14);
        contentApulo14.put("description", description14);
        contentApulo14.put("phone", phone14);
        contentApulo14.put("email", email14);
        contentApulo14.put("image", imageFile14);
        contentApulo14.put("coords", coords14);

        return contentApulo14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentApulo15.put("title", title15);
        contentApulo15.put("description", description15);
        contentApulo15.put("phone", phone15);
        contentApulo15.put("email", email15);
        contentApulo15.put("image", imageFile15);
        contentApulo15.put("coords", coords15);

        return contentApulo15;
    }
}
