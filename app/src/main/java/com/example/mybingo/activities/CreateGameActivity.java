package com.example.mybingo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class CreateGameActivity extends AppCompatActivity {

    private AppCompatButton startGameBtn;
    private RadioGroup rgPlayer, rgCard;
    public RadioButton selectNumPlayer, selectNumCard;
    public int radioIdCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_game);
        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }


        rgPlayer = findViewById(R.id.rgb_num_player);
        rgCard = findViewById(R.id.rgb_num_card);
        startGameBtn = findViewById(R.id.btn_startGame);

        startGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                selectedCard();

            }
        });

    }

    public void checkButtonNumPlayer(View view){

        int radioIdPlayer = rgPlayer.getCheckedRadioButtonId();
        selectNumPlayer = (RadioButton) findViewById(radioIdPlayer);
        Toast.makeText(this, "Hai selezionato "+selectNumPlayer.getText()+" giocatori", Toast.LENGTH_SHORT).show();
    }
    public void checkButtonNumCard(View view){

        radioIdCard = rgCard.getCheckedRadioButtonId();
        selectNumCard = (RadioButton) findViewById(radioIdCard);
        Toast.makeText(this, "Hai selezionato "+selectNumCard.getText()+" cartelle", Toast.LENGTH_SHORT).show();

    }

    public void selectedCard () {
        if (selectNumCard.getText().equals("2")) {
            startGameTwo();
        }
        else {
            startGame();
        }
    }

    public void startGameTwo () {
        Intent intentGame = new Intent(CreateGameActivity.this, StartGameTwoCardActivity.class);
        startActivity(intentGame);
    }

    public void startGame () {
        Intent intentGame = new Intent(CreateGameActivity.this, StartGameActivity.class);
        startActivity(intentGame);
    }
}