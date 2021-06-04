package org.yoanshin.dnd4game.engine;

import org.yoanshin.dnd4game.engine.exceptions.EngineException;

import java.util.Map;
import java.util.Random;

public class DiceRoller {

    private static Map<Dice, Integer> dices = Map.of(
            Dice.D3, 3,
            Dice.D4, 4,
            Dice.D6, 6,
            Dice.D8, 8,
            Dice.D10, 10,
            Dice.D12, 12,
            Dice.D20, 20,
            Dice.D100, 100
    );

    public enum Dice {
        D3,
        D4,
        D6,
        D8,
        D10,
        D12,
        D20,
        D100
    }

    public static int rollDices(final Dice dice, final int number) {
        return new Random().ints(1, dices.get(dice)+1).limit(number).sum();
    }

    public static int rollDices(final Dice dice, final int number, final Modifier modifierType, final int modifier) {
        int roll = rollDices(dice, number);
        switch (modifierType) {
            case BONUS:
                roll += modifier;
                return roll;
            case MALUS:
                return Math.max(roll - modifier, 0);
            default:
                throw new EngineException("Unknown modifier for dice roll: " +modifierType.name());
        }
    }
}
