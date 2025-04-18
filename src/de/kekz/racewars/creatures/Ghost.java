package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the ghost creature.
 */
class Ghost extends Creature {
    Ghost(Race race, double health, double armor, double damage, double speed) {
        super(race, health, armor, damage, speed);
    }
}
