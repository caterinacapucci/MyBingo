package com.example.mybingo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class HomeActivity extends AppCompatActivity {

    AppCompatButton loginBtn, hostBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        loginBtn = findViewById(R.id.btn_login);
        hostBtn = findViewById(R.id.btn_host);

        loginBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                PageLogin();
            }
        });

        hostBtn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                HostLogin();
            }
        });
    }

    //metodo per andare al login
    public void PageLogin(){
        Intent intentHome = new Intent(this, LoginActivity.class);
        startActivity(intentHome);
    }

    //metodo per accedere da host
    public void HostLogin() {
        Intent intentHost = new Intent(this,GameActivity.class);
        startActivity(intentHost);
    }
}