package com.example.mybingo.activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.AlertDialog;
import android.app.Dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mybingo.R;

public class LoginActivity extends AppCompatActivity {

    private TextView registerBtn;
    private AppCompatButton loginBtn;


    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerBtn = findViewById(R.id.tv_register);
        loginBtn = findViewById(R.id.btn_login);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getActionBar().setDisplayHomeAsUpEnabled(true);

                if(TextUtils.isEmpty(username.getText())){
                    /*AlertDialog.Builder miaAlert = new AlertDialog.Builder(this);
                    miaAlert.setTitle("Attenzione!");
                    miaAlert.setMessage("Inserisci l'username per accedere");
                    AlertDialog alert = miaAlert.create();
                    alert.show();*/
                    //Toast.makeText(getApplicationContext(), "Inserisci la password", Toast.LENGTH_SHORT ).show();
                } else if(TextUtils.isEmpty(password.getText())){
                    Toast.makeText(getApplicationContext(), "Inserisci la password", Toast.LENGTH_SHORT ).show();
                } else if (TextUtils.isEmpty(username.getText()) && TextUtils.isEmpty(password.getText())){
                    Toast.makeText(getApplicationContext(), "Inserisci le credenziali", Toast.LENGTH_SHORT ).show();
                } else {
                    Intent intentLogin = new Intent(LoginActivity.this, GameActivity.class);
                    startActivity(intentLogin);
                }
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intentRegister);
                getActionBar().setDisplayHomeAsUpEnabled(true);

            }
        });

    }

}