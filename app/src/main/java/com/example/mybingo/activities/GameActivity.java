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

    private AppCompatButton createGameBtn, closeRulesBtn, exitGame;
    private Dialog rulesDialog;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rulesDialog = new Dialog(this);
        this.scrollView = (ScrollView) this.findViewById(R.id.scrollView);
        createGameBtn = findViewById(R.id.btn_createGame);


        createGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createGame();

            }
        });

        exitGame = findViewById(R.id.btn_LOGOUTGame);
        exitGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                toExit();
            }
        });



    }

    //metodo per creare partita
    public void createGame() {
        Intent toGame = new Intent(this, CreateGameActivity.class);
        startActivity(toGame);
    }

    //metodo per uscire dal gioco
    public void toExit() {
        onDestroy();
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