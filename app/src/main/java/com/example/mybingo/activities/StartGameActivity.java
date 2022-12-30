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
    private Dialog finishGameDialog;
    private AppCompatButton yesBtn, noBtn, newBtn, exitBtn;

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

        finishGameDialog = new Dialog(this);
        exitGameDialog = new Dialog(this);

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
                    showPopupFinishGame(bingo);
                }

            }
        });

    }

    public void setUsername (){

    }

    //Random Number
    //Finish game method
    public void showPopupFinishGame(View view) {
        finishGameDialog.setContentView(R.layout.finish_game_pop_up);
        newBtn = (AppCompatButton) finishGameDialog.findViewById(R.id.btn_new);
        exitBtn = (AppCompatButton) finishGameDialog.findViewById(R.id.btn_exit);
        newBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartGameActivity.this, CreateGameActivity.class);
                startActivity(intent);
                finish();
            }
        });
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(StartGameActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        finishGameDialog.show();
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