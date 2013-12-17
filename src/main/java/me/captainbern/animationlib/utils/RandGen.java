package me.captainbern.animationlib.utils;

import java.util.Random;

public class RandGen {

    private final static Random rand = new Random();

    public static int nextInt(){
        return rand.nextInt();
    }
}
