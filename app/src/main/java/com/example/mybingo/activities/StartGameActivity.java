package com.example.mybingo.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mybingo.R;

public class StartGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
            ;
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

    }
}