package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvfilm;
    String film[] = {"Spiderman", "Titanic", "Batman"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvfilm = (ListView) findViewById(R.id.lvFilm);
        ArrayAdapter <String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        lvfilm.setAdapter(aaFilm);
    }
}