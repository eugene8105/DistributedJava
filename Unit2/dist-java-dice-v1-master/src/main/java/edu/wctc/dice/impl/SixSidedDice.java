package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceShape;
import org.springframework.stereotype.Component;

import java.util.Random;

public class SixSidedDice implements DiceShape {

    public SixSidedDice(){
        System.out.println("Six-sided dice was created.");
    }

    @Override
    public int shape() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
