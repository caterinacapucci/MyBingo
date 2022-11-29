package com.example.mybingo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mybingo.R;

public class RegisterActivity extends AppCompatActivity {

    private TextView loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginBtn = findViewById(R.id.tv_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActionBar().setDisplayHomeAsUpEnabled(true);
                Intent intentRegister = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intentRegister);
                getActionBar().setDisplayHomeAsUpEnabled(true);

            }
        });
    }
}