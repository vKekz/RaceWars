package de.kekz.racewars.creatures;

import de.kekz.racewars.models.enums.Element;

/**
 * Represents the demon slayer creature.
 */
class DemonSlayer extends DarkElf {
    DemonSlayer() {
        markAsLeader(Element.Air, 3D);
    }
}
