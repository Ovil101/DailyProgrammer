package helper;

/**
 * Simulates a dice
 */

import java.util.Random;

public class Dice {
    private int sides = 0;
    private Random rand = new Random();

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return rand.nextInt(sides) + 1;
    }
}
