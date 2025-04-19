package de.kekz.racewars.creatures;

import de.kekz.racewars.models.ILeader;
import de.kekz.racewars.models.enums.Element;

/**
 * Represents the farseer creature.
 */
class Farseer extends Orc implements ILeader {
    @Override
    public Element getElement() {
        return Element.Earth;
    }

    @Override
    public double getBonus() {
        return 1.2D;
    }
}
