package com.example.mybingo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class GameActivity extends AppCompatActivity {

    private AppCompatButton createGameBtn;
    private AppCompatButton exitGame;
    private AppCompatButton rulesGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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

        rulesGame = findViewById(R.id.btn_rulesGame);
        rulesGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                RulesFragment RulesFragment = new RulesFragment();
//                fragmentTransaction.replace(R.id.RulesFragment, RulesFragment);
//                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//                fragmentTransaction.addToBackStack("Transaction first");
//                fragmentTransaction.commit();
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
}