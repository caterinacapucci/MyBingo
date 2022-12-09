package com.example.mybingo.models;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreateGameModel {

    private int numPlayer;

    private int numCard;

    private RadioGroup rgPlayer;

    public int getNumPlayer() {
        return numPlayer;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

}
