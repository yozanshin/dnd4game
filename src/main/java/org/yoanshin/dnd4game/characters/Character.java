package org.yoanshin.dnd4game.characters;

import org.yoanshin.dnd4game.stats.Ability;

import java.util.Map;

public abstract class Character {

    protected final Map<Ability, Integer> abilities = Map.of(
            Ability.STRENGTH, 0,
            Ability.DEXTERITY, 0,
            Ability.CONSTITUTION, 0,
            Ability.INTELLIGENCE, 0,
            Ability.WISDOM, 0,
            Ability.CHARISMA, 0);

    protected String name;
    protected int level;
}
