package com.example.emobilis.funfactsreloaded;

import java.util.Random;

public class FactBook {
    private String[] mFacts = {
            "An ant stretches when they wake up in the morning...",
            "Ostriches can run faster than a horse...",
            "Olympic Gold Medals are actually made mostly of silver...",
            "You are born with 300 bones; by the time you're an adult you'll have 206...",
            "It takes about 8 minutes for light from the sun to reach the earth...",
            "Some Bamboo plants can grow almost a metre in just one day...",
            "The State of Florida is bigger than England...",
            "Some penguins can leap 2-3 metres out of the water...",
            "On average, it takes 66 days to form a new habit...",
            "Mammoths still walked the earth walked the earth when the great pyramid was being built..."
    };

    public String getFact(){
        //Generating a random number in relation to the number of items in the array
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        String fact = "" ;

        //Obtaining a random fact
        fact = mFacts[randomNumber];

        return fact;
    }
}
