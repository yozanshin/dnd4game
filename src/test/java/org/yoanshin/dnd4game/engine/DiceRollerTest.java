package org.yoanshin.dnd4game.engine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

public class DiceRollerTest {

    @Test
    public void testD3roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D3, 1)).isBetween(1, 3);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D3, 2)).isBetween(2, 6);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D3, 1, Modifier.BONUS, 1)).isBetween(2, 4);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D3, 1, Modifier.MALUS, 2)).isBetween(0, 1);
    }

    @Test
    public void testD4roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D4, 1)).isBetween(1, 4);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D4, 2)).isBetween(2, 8);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D4, 1, Modifier.BONUS, 1)).isBetween(2, 5);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D4, 1, Modifier.MALUS, 2)).isBetween(0, 2);
    }

    @Test
    public void testD6roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D6, 1)).isBetween(1, 6);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D6, 2)).isBetween(2, 12);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D6, 1, Modifier.BONUS, 1)).isBetween(2, 7);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D6, 1, Modifier.MALUS, 2)).isBetween(0, 4);
    }

    @Test
    public void testD8roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D8, 1)).isBetween(1, 8);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D8, 2)).isBetween(2, 16);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D8, 1, Modifier.BONUS, 1)).isBetween(2, 9);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D8, 1, Modifier.MALUS, 2)).isBetween(0, 6);
    }

    @Test
    public void testD10roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D10, 1)).isBetween(1, 10);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D10, 2)).isBetween(2, 20);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D10, 1, Modifier.BONUS, 1)).isBetween(2, 11);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D10, 1, Modifier.MALUS, 2)).isBetween(0, 8);
    }

    @Test
    public void testD12roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D12, 1)).isBetween(1, 12);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D12, 2)).isBetween(2, 24);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D12, 1, Modifier.BONUS, 1)).isBetween(2, 13);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D12, 1, Modifier.MALUS, 2)).isBetween(0, 10);
    }

    @Test
    public void testD20roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D20, 1)).isBetween(1, 20);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D20, 2)).isBetween(2, 40);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D20, 1, Modifier.BONUS, 1)).isBetween(2, 21);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D20, 1, Modifier.MALUS, 2)).isBetween(0, 18);
    }

    @Test
    public void testD100roll() {
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D100, 1)).isBetween(1, 100);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D100, 2)).isBetween(2, 200);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D100, 1, Modifier.BONUS, 1)).isBetween(2, 101);
        assertThat(DiceRoller.rollDices(DiceRoller.Dice.D100, 1, Modifier.MALUS, 2)).isBetween(0, 98);
    }

    @Test
    public void testGauss() {
        int[] results = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        IntStream.range(1, 1001).forEach(i -> results[DiceRoller.rollDices(DiceRoller.Dice.D10, 1)-1]++);
        System.out.println(Arrays.toString(results));
    }
}