package de.kekz.racewars.creatures.human;

import de.kekz.racewars.creatures.Creature;
import de.kekz.racewars.creatures.enums.Race;

public class Human extends Creature
{
    Human()
    {
        super(Race.Human, 140, 0.4D, 40, 2);
    }
}
