package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the human creature.
 */
class Human extends Creature {
    Human() {
        super(Race.Human, 140, 0.4D, 40, 2);
    }
}
