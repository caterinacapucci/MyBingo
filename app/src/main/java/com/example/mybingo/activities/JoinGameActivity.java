package com.example.mybingo.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class JoinGameActivity extends AppCompatActivity {

    private Dialog joinGameDialog, exitGameDialog;
    private AppCompatButton closeRulesBtn, yesBtn, noBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_game);

        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        joinGameDialog = new Dialog(this);

    }

    //Method dialog rules
    public void showPopupRules(View view){
        joinGameDialog.setContentView(R.layout.search_game_pop_up);
        closeRulesBtn =  joinGameDialog.findViewById(R.id.btn_exit);

        closeRulesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinGameActivity.this, GameActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}