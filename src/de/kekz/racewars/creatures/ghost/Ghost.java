package de.kekz.racewars.creatures.ghost;

import de.kekz.racewars.creatures.Creature;
import de.kekz.racewars.creatures.enums.Race;

class Ghost extends Creature
{
    Ghost(Race race, double health, double armor, double damage, double speed)
    {
        super(race, health, armor, damage, speed);
    }
}
