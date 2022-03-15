package org.fnb.dnd4manager.utils;

import org.fnb.dnd4manager.types.DiceType;

import java.util.Random;
import java.util.stream.IntStream;

public class DiceRoller {

    private static final Random rand = new Random();

    public static int roll(final DiceType diceType, final int number, final int modifier) {
        return IntStream.range(1, number+1)
                .map(i -> rand.nextInt(diceType.getValue()) + 1)
                .sum()+modifier;
    }
}
