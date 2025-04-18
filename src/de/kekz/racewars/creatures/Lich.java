package de.kekz.racewars.creatures;

import de.kekz.racewars.models.enums.Element;

/**
 * Represents the lich creature.
 */
class Lich extends Undead {
    Lich() {
        markAsLeader(Element.Water, 2.3D);
    }
}
