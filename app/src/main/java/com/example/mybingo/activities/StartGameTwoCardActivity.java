package com.example.mybingo.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.mybingo.R;

public class StartGameTwoCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satrt_game_two_card);

        try {
            this.getActionBar().setDisplayHomeAsUpEnabled(true);
            ;
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        AppCompatButton bingo = (AppCompatButton)findViewById(R.id.btn_bingo);
        bingo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if(bingo.getText().toString().trim().equals("TERNO")){
                    bingo.setText("CINQUINA");
                    bingo.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_btn_customize_cinquina));

                } else if(bingo.getText().toString().trim().equals("CINQUINA")){
                    bingo.setText("DECINA");
                    bingo.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_btn_customize_decina));
                } else if (bingo.getText().toString().trim().equals("DECINA")) {
                    bingo.setText("BINGO");
                    bingo.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_btn_customize_green));
                } else if(bingo.getText().toString().trim().equals("BINGO")){
                    bingo.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_btn_customize_bingo));
                    bingo.setEnabled(false);
                }

            }
        });
    }
}