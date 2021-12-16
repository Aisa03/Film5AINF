package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvfilm;
    String film[] = {"Spiderman", "Titanic", "Batman"};
    Button btnesci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvfilm = (ListView) findViewById(R.id.lvFilm);

        ArrayAdapter <String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        lvfilm.setAdapter(aaFilm);

        //-----------------------------------------------------------------------------
        lvfilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo = (String) lvfilm.getItemAtPosition(position);
                Log.d("errori_nostri", "posizione: "+ position);
                Toast.makeText(getApplicationContext(),titolo)

            }
        });

        btnesci = (Button) findViewById(R.id.btnesci);
        btnesci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vuoi uscire", Toast.LENGTH_LONG).show();
            }
        });
    }
    //abbiamo creato un contenitore che viene utilizzato per essere popolato da dei dati (arrayadapter)
    //in particolare lo usiamo per la listview

    //ascoltatore, porre un oggetto in ascolto continuo sugli effetti che avvengono su di lui
    //l'ascoltatore permette di controllare meglio la situazione.
}