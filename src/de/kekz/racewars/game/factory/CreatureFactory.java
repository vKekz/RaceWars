package de.kekz.racewars.game.factory;

import de.kekz.racewars.creatures.CreatureRegistry;
import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

/**
 * Represents the race factory that is used to buy and instantiate creatures.
 */
public class CreatureFactory {
    private static final CreatureRegistry creatureRegistry = new CreatureRegistry();

    /**
     * Returns an array of creatures given by the race and available budget.
     */
    public Creature[] buyCreatures(Race race, int budget) {
        int leaderCost = race.getLeaderCost();
        if (budget < leaderCost + race.getCost()) {
            return new Creature[0];
        }

        // Make sure to subtract the leader cost first
        int creatureCount = (budget - leaderCost) / race.getCost();

        Creature[] creatures = new Creature[creatureCount];
        creatures[0] = creatureRegistry.getCreatureByRace(race.getLeader());

        for (int i = 1; i < creatures.length; i++) {
            creatures[i] = creatureRegistry.getCreatureByRace(race);
        }

        return creatures;
    }
}