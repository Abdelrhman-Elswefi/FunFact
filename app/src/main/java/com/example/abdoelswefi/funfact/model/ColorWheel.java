package com.example.abdoelswefi.funfact.model;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Abdo Elswefi on 13-Mar-18.
 */

public class ColorWheel {
    private String[] colors = {"#39add1",// light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab28", // mustard
            "@637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {
        Random random = new Random();
        int randomNumber = random.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);

    }

    public int getColorAtIndex(int i) {
        return Color.parseColor(colors[i]);
    }
}
