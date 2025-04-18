package de.kekz.racewars;

import de.kekz.racewars.creatures.CreatureFactory;
import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

public class GameController {
    private static final CreatureFactory creatureFactory = new CreatureFactory();

    public static void main(String... args) {
        runGame();
    }

    private static void runGame() {
        Creature[] creatures = creatureFactory.getCreaturesByRace(Race.Human, 1000);

        for (Creature creature : creatures) {
            System.out.println(creature.toString());
        }

        creatures[0].attack(creatures[1]);

        System.out.println(" ");

        for (Creature creature : creatures) {
            System.out.println(creature.toString());
        }
    }
}
