package de.kekz.racewars.creatures;

import de.kekz.racewars.models.ILeader;
import de.kekz.racewars.models.enums.Element;

/**
 * Represents the lich creature.
 */
class Lich extends Undead implements ILeader {
    @Override
    public Element getElement() {
        return Element.Water;
    }

    @Override
    public double getBonus() {
        return 2.3D;
    }
}
