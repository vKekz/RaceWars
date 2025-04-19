package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the ghost creature.
 */
class Ghost extends Creature {
    private Ghost() {
        super(Race.Ghost, 0D, 0D, 0D, 0D);
    }
}
