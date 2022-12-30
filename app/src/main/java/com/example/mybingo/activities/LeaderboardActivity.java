package com.example.mybingo.activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mybingo.R;

import java.util.ArrayList;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
            ;
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        // definisco un array di stringhe
        String[] nameGamer = new String[] { "Username", "Partite giocare", "Punti ottenuti" };

        // definisco un ArrayList
        final ArrayList<String> listp = new ArrayList<String>();
        for (int i = 0; i < nameGamer.length; ++i) {
            listp.add(nameGamer[i]);
        }
        // recupero la lista dal layout
        final ListView classifica = (ListView) findViewById(R.id.classifica);

        // creo e istruisco l'adattatore
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listp);

        // inietto i dati
        classifica.setAdapter(adapter);

    }
}