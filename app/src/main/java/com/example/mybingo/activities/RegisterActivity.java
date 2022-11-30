package com.example.mybingo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class RegisterActivity extends AppCompatActivity {

    private AppCompatButton registerBtn;
    public EditText usernameTxt;
    public EditText passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        usernameTxt = findViewById(R.id.username);
        passwordTxt = findViewById(R.id.password);
        registerBtn = findViewById(R.id.signUp_btn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (usernameTxt.getText().toString().trim().isEmpty()) {
                    usernameTxt.setError(getText(R.string.err_richiesto));
                    usernameTxt.requestFocus();
                } else if (passwordTxt.getText().toString().trim().isEmpty()) {
                    passwordTxt.setError(getText(R.string.err_richiesto));
                    passwordTxt.requestFocus();
                } else if (usernameTxt.getText().toString().trim().isEmpty() && passwordTxt.getText().toString().trim().isEmpty()) {
                    usernameTxt.setError(getText(R.string.err_richiesto));
                    passwordTxt.setError(getText(R.string.err_richiesto));
                    usernameTxt.requestFocus();
                    passwordTxt.requestFocus();
                } else {
                    registerPage();
                    finish();
                }

            }
        });

    }

    public void registerPage() {
        Intent toRegister = new Intent(this, LoginActivity.class);
        startActivity(toRegister);
    }
}