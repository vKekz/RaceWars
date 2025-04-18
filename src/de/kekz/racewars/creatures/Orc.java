package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the orc creature.
 */
class Orc extends Creature {
    Orc() {
        super(Race.Orc, 100D,0.3D, 33D, 1D);
    }
}
