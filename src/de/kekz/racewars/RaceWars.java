package de.kekz.racewars;

import de.kekz.racewars.creatures.enums.Race;
import de.kekz.racewars.factory.RaceFactory;

public class RaceWars
{
    private static final RaceFactory raceFactory = new RaceFactory();

    public static void main(String... args)
    {
    }

    public void startGame() {
        raceFactory.getCreaturesByRace(Race.Orc, 100);
    }
}
