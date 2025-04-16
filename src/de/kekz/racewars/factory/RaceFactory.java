package de.kekz.racewars.factory;

import de.kekz.racewars.creatures.Creature;
import de.kekz.racewars.creatures.enums.Race;

public class RaceFactory
{
    public Creature[] getCreaturesByRace(Race race, int budget)
    {
        int bossCost = race.getCost() * 2;
        if (budget < bossCost) {
            return new Creature[] {};
        }

        int creatureCount = 0;
        creatureCount++;
        budget -= bossCost;

        creatureCount += Math.round(((float)budget / race.getCost()));

        Creature[] creatures = new Creature[creatureCount];

        for (int i = 0; i < creatureCount; i++) {
            if (i == 0) {
            }
        }

        return creatures;
    }
}
