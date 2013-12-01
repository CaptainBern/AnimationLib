package me.captainbern.animationlib.utils.wrappers;

import java.util.Random;

public class RandGen {

    private final static Random rand = new Random();

    public static int nextInt(){
        return rand.nextInt();
    }
}
