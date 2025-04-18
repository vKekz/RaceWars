package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the undead creature.
 */
class Undead extends Creature {
    Undead() {
        super(Race.Undead, 120, 0.3D, 16D, 2D);
    }
}
