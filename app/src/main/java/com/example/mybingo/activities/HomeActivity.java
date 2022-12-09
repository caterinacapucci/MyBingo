package com.example.mybingo.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class HomeActivity extends AppCompatActivity {

    private AppCompatButton createGameBtn, closeRulesBtn, exitGame;
    private Dialog rulesDialog;
    private ScrollView scrollView;

    AppCompatButton loginBtn, hostBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rulesDialog = new Dialog(this);
        this.scrollView = (ScrollView) this.findViewById(R.id.scrollView);
        loginBtn = findViewById(R.id.btn_login);
        hostBtn = findViewById(R.id.btn_host);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        hostBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,StartGameActivity.class);
                startActivity(intent);
            }
        });
    }

    //Method dialog rules
    public void showPopupRules(View view){
        rulesDialog.setContentView(R.layout.rules_pop_up);
        closeRulesBtn =  rulesDialog.findViewById(R.id.btn_fine);

        closeRulesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                rulesDialog.dismiss();
            }
        });
        rulesDialog.show();
    }

}