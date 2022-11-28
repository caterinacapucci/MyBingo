package com.example.mybingo.activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.mybingo.R;

public class LoginActivity extends AppCompatActivity {

    private TextView registerBtn;
    private AppCompatButton loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerBtn = findViewById(R.id.tv_register);
        loginBtn = findViewById(R.id.btn_login);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentLogin = new Intent(LoginActivity.this, GameActivity.class);
                startActivity(intentLogin);
                finish();
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intentRegister);
                finish();
            }
        });
    }
}