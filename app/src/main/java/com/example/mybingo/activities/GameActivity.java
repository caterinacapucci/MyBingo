package com.example.mybingo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mybingo.R;

public class GameActivity extends AppCompatActivity {

    private TextView tvUsername;
    private AppCompatButton createGameBtn, joinGameBtn, singleGameBtn, rankingBtn, rulesBtn, exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvUsername = findViewById(R.id.tv_username);
        /*createGameBtn = findViewById(R.id.btn_createGame);
        joinGameBtn = findViewById(R.id.btn_joinGame);
        singleGameBtn = findViewById(R.id.btn_singleGame);
        rankingBtn = findViewById(R.id.btn_ranking);
        rulesBtn = findViewById(R.id.btn_rules);
        exitBtn = findViewById(R.id.btn_exit);

        createGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        joinGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        singleGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        rankingBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        rulesBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });*/

    }
}