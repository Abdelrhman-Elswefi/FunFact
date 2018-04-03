package com.example.abdoelswefi.funfact.model;

import java.util.Random;

/**
 * Created by Abdo Elswefi on 13-Mar-18.
 */

public class FactBook {

    private String[] mFacts = {"Ostriches can run faster than horses! ",
            "Ants stretch when they wake up in the morning ! ",
            "Olympic gold medals are actually made mostly of silver ! ",
            "you are born with 300 bones , by the time you are and adult you will have 206 !",
            "It takes about 8 minutes for light from the sun to reach Earth !",
            "Some bamboo plants can grow almost a meter in just one day !",
            "The state of florida is bigger than England !",
            "Some penguins can leap 2-3 meters out of the water !",
            "On average it takes 66 days to form a new habit !",
            "Mammoths still walked the Earth when The Great Pyramid was being built !"};

    public String getFact() {
        Random random = new Random();
        int randomNumber = random.nextInt(mFacts.length);
        return mFacts[randomNumber];
    }

    public String getFactAtIndex(int i) {
        return mFacts[i];
    }
}
