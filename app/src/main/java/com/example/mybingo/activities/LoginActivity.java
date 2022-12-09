package com.example.mybingo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class LoginActivity extends AppCompatActivity {

    private AppCompatButton loginBtn;
    private TextView registerBtn;

    public EditText usernameTxt;
    public EditText passwordTxt;

    public static String usernameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        usernameTxt = findViewById(R.id.username);
        passwordTxt = findViewById(R.id.password);
        loginBtn = findViewById(R.id.btn_login);
        registerBtn = findViewById(R.id.btn_register);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                loginPage();
                usernameString = usernameTxt.getText().toString();

            }
        });


        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                registerPage();
            }
        });

    }

    //metodo per andare al login
    public void loginPage() {
        Intent toLogin = new Intent(this, GameActivity.class);
        startActivity(toLogin);
    }

    //metodo per andare alla registazione
    public void registerPage() {
        Intent toRegister = new Intent(this, RegisterActivity.class);
        startActivity(toRegister);
    }

    //metodo per uscire dal gioco
    public void exitGame() {
        onDestroy();
    }

}