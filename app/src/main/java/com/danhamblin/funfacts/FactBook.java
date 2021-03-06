package com.danhamblin.funfacts;

import java.util.Random;

/**
 * Created by nadiy on 12/27/2015.
 */
public class FactBook {
    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are made of mostly silver.",
            "You are born with 300 bones, by the time you are an adult you will have 206.",
            "It takes about eight minutes for the light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was built.",
            "Treehouse is not actually in a tree."
    };

    // Method (abilities: things the object can do)
    public String getFact(){



        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
