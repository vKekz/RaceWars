package de.kekz.racewars.models;

import de.kekz.racewars.models.enums.Element;

/**
 * Represents the interface of a creature leader.
 */
public interface ILeader {
    /**
     * Returns the leaders element.
     */
    Element getElement();
    /**
     * Returns the leaders bonus.
     */
    double getBonus();
}
