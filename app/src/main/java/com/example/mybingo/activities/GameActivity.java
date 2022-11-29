package com.example.mybingo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybingo.R;

public class GameActivity extends AppCompatActivity {

    private AppCompatButton createGameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        createGameBtn = findViewById(R.id.btn_createGame);


        createGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActionBar().setDisplayHomeAsUpEnabled(true);

                Intent intentLogin = new Intent(GameActivity.this, CreateGameActivity.class);
                startActivity(intentLogin);

            }
        });
    }
}