package de.kekz.racewars.creatures;

import de.kekz.racewars.models.enums.Element;

/**
 * Represents the farseer creature.
 */
class Farseer extends Orc {
    Farseer() {
        markAsLeader(Element.Earth, 1.2D);
    }
}
