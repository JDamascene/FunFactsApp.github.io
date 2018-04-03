package com.example.emobilis.funfactsreloaded;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
    };

    public int getColor() {
        //Generating a random number in relation to the number of items in the array
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        String color;

        //Obtaining a random fact
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
