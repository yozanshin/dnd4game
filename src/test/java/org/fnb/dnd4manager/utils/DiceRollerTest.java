package org.fnb.dnd4manager.utils;

import org.assertj.core.api.Assertions;
import org.fnb.dnd4manager.types.DiceType;
import org.junit.jupiter.api.Test;

class DiceRollerTest {

    @Test
    public void shouldRollDices() {
        checkDiceRolls(DiceType.D2);
        checkDiceRolls(DiceType.D3);
        checkDiceRolls(DiceType.D4);
        checkDiceRolls(DiceType.D6);
        checkDiceRolls(DiceType.D8);
        checkDiceRolls(DiceType.D10);
        checkDiceRolls(DiceType.D12);
        checkDiceRolls(DiceType.D20);
        checkDiceRolls(DiceType.D100);
    }

    private void checkDiceRolls(DiceType diceType) {
        int number, modifier;
        for (int i = 0; i < 10; i += 2) {
            number = i;
            modifier = i+1;
            Assertions.assertThat(DiceRoller.roll(diceType, i, i + 1))
                    .isBetween(number+modifier, (number*diceType.getValue())+modifier);
        }
    }
}