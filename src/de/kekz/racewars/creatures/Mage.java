package de.kekz.racewars.creatures;

import de.kekz.racewars.models.ILeader;
import de.kekz.racewars.models.enums.Element;

/**
 * Represents the mage creature.
 */
class Mage extends Human implements ILeader {
    @Override
    public Element getElement() {
        return Element.Fire;
    }

    @Override
    public double getBonus() {
        return 5D;
    }
}
