package de.kekz.racewars.creatures;

import de.kekz.racewars.models.enums.Element;

/**
 * Represents the mage creature.
 */
class Mage extends Human {
    Mage() {
        markAsLeader(Element.Fire, 5D);
    }
}
