package com.example.mybingo.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class GameActivity extends AppCompatActivity {

    private AppCompatButton createGameBtn, closeRulesBtn, exitGame, yesBtn, noBtn;
    private Dialog rulesDialog, exitGameDialog;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rulesDialog = new Dialog(this);
        exitGameDialog = new Dialog(this);
        this.scrollView = (ScrollView) this.findViewById(R.id.scrollView);
        createGameBtn = findViewById(R.id.btn_createGame);


        createGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toGame = new Intent(GameActivity.this, CreateGameActivity.class);
                startActivity(toGame);

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

    //Exit Game Method
    public void showPopupExitGame(View view) {
        exitGameDialog.setContentView(R.layout.exit_game_pop_up);
        yesBtn = (AppCompatButton) exitGameDialog.findViewById(R.id.btn_yes);
        noBtn = (AppCompatButton) exitGameDialog.findViewById(R.id.btn_no);
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this, HomeActivity.class);
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