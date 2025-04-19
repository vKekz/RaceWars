package de.kekz.racewars.creatures;

import de.kekz.racewars.models.ILeader;
import de.kekz.racewars.models.enums.Element;

/**
 * Represents the demon slayer creature.
 */
class DemonSlayer extends DarkElf implements ILeader {
    @Override
    public Element getElement() {
        return Element.Air;
    }

    @Override
    public double getBonus() {
        return 3D;
    }
}
