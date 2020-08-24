package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceShape;
import org.springframework.stereotype.Component;

import java.util.Random;

public class ThreeSidedDice implements DiceShape {

    public ThreeSidedDice(){
        System.out.println("Three-Sided dice was created.");
    }

    @Override
    public int shape() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
