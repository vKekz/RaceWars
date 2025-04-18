package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the dark elf creature.
 */
class DarkElf extends Creature {
    DarkElf() {
        super(Race.DarkElf, 120, 0.2D, 15, 3);
    }
}
