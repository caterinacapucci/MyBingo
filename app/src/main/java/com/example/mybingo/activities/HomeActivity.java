package com.example.mybingo.activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
                Intent intentHome = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intentHome);
            }
        });

        hostBtn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {


                Intent intentHost = new Intent(HomeActivity.this,GameActivity.class);
                startActivity(intentHost);
            }
        });
    }

}