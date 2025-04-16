package de.kekz.racewars.creatures.undead;

import de.kekz.racewars.creatures.Creature;
import de.kekz.racewars.creatures.enums.Race;

class Undead extends Creature
{
    Undead()
    {
        super(Race.Undead, 120, 0.3D, 16D, 2D);
    }
}
