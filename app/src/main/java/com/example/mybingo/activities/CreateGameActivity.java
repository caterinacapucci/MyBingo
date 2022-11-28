package com.example.mybingo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.mybingo.R;

public class CreateGameActivity extends AppCompatActivity {

    private AppCompatButton startGameBtn;
    private RadioGroup rgPlayer;
    private RadioGroup rgCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_game);

        rgPlayer = findViewById(R.id.rgb_num_player);
        rgCard = findViewById(R.id.rgb_num_card);
        startGameBtn = findViewById(R.id.btn_startGame);


        startGameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intentLogin = new Intent(CreateGameActivity.this, StartGameActivity.class);
                startActivity(intentLogin);
                finish();
            }
        });

    }

    public void checkButtonNumPlayer(View view){

        int radioIdPlayer = rgPlayer.getCheckedRadioButtonId();
        RadioButton selectNumPlayer = (RadioButton) findViewById(radioIdPlayer);
        Toast.makeText(this, "Hai selezionato "+selectNumPlayer.getText()+" giocatori", Toast.LENGTH_SHORT).show();
    }
    public void checkButtonNumCard(View view){

        int radioIdCard = rgCard.getCheckedRadioButtonId();
        RadioButton selectNumCard = (RadioButton) findViewById(radioIdCard);
        Toast.makeText(this, "Hai selezionato "+selectNumCard.getText()+" cartelle", Toast.LENGTH_SHORT).show();
    }
}