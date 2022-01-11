package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
//Ciao
public class MainActivity2 extends AppCompatActivity {

    ImageView imgavatar;
    ImageView imgSpiderman;
    ImageView imgTitanic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgavatar = findViewById(R.id.imgape);
        imgavatar.setImageResource(R.drawable.piaggio_ape_p50_06);
        imgSpiderman.setImageResource(R.drawable.spiderman);
        Intent secInt = getIntent();
        String titolo = secInt.getStringExtra(),titolo;
                Toast.LENGTH_LONG)

    }


}