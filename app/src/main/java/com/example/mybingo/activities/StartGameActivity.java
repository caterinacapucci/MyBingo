package com.example.mybingo.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class StartGameActivity extends AppCompatActivity {

    private Dialog exitGameDialog;
    private AppCompatButton yesBtn, noBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
            ;
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        exitGameDialog = new Dialog(this);

    }




    //Exit Game Method
    public void showPopupExitGame(View view) {
        exitGameDialog.setContentView(R.layout.exit_game_pop_up);
        yesBtn = (AppCompatButton) exitGameDialog.findViewById(R.id.btn_yes);
        noBtn = (AppCompatButton) exitGameDialog.findViewById(R.id.btn_no);
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartGameActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitGameDialog.dismiss();
            }
        });
        exitGameDialog.show();
    }
}