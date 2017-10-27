package com.aventurayturismo.at.adventure_details;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aventurayturismo.at.R;

public class AdventureDetailActivity extends AppCompatActivity {
    TextView description;
    TextView title;
    String phoneNumber;
    String email;
    ImageView contentImage;
    Uri gmmIntentUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_detail);

        title = (TextView)findViewById(R.id.title);
        description = (TextView)findViewById(R.id.beneficio);
        contentImage = (ImageView)findViewById(R.id.idImagen);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            title.setText(extras.getString("title"));
            description.setText(extras.getString("description"));
            contentImage.setImageResource(extras.getInt("image"));

            phoneNumber = extras.getString("phone");

            email = extras.getString("email");

            gmmIntentUri = Uri.parse("geo:"+extras.getString("coords")+"?q="+extras.getString("coords")+"");
        }

        description.setMovementMethod(new ScrollingMovementMethod());
    }

    public void triggerCall(View v) {
        String number = "tel:" + phoneNumber.toString();
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse(number));
        startActivity(callIntent);
    }

    public void geolocationFind(View v){
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }

        //Toast.makeText(v.getContext(), "Mapas: ", Toast.LENGTH_LONG).show();
    }

    public void sendEmail(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto",email, null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
        //Toast.makeText(v.getContext(), "Correo: ", Toast.LENGTH_LONG).show();
    }
}
