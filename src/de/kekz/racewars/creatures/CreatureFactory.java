package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

import java.util.HashMap;
import java.util.function.Supplier;

/**
 * Represents the race factory that is used to buy and instantiate creatures.
 */
public class CreatureFactory {
    private static final HashMap<Race, Supplier<Creature>> creatures = new HashMap<>(Race.values().length);

    /**
     * Initializes a new instance of the {@link CreatureFactory} class.
     */
    public CreatureFactory() {
        registerCreatures();
    }

    /**
     * Returns an array of creatures given by the race and available budget.
     */
    public Creature[] getCreaturesByRace(Race race, int budget) {
        int leaderCost = race.getLeaderCost();
        if (budget < leaderCost + race.getCost()) {
            return new Creature[0];
        }

        // Make sure to subtract the leader cost first
        int creatureCount = (budget - leaderCost) / race.getCost();

        Creature[] creatures = new Creature[creatureCount];
        creatures[0] = getCreatureByRace(race.getLeader());

        for (int i = 1; i < creatures.length; i++) {
            creatures[i] = getCreatureByRace(race);
        }

        return creatures;
    }

    private Creature getCreatureByRace(Race race) {
        Supplier<Creature> supplier = creatures.get(race);
        if (supplier == null) {
            throw new NullPointerException("Supplier for " + race.name() + " not registered");
        }

        return supplier.get();
    }

    private void registerCreatures() {
        creatures.put(Race.Orc, Orc::new);
        creatures.put(Race.Orc.getLeader(), Farseer::new);

        creatures.put(Race.Undead, Undead::new);
        creatures.put(Race.Undead.getLeader(), Lich::new);

        creatures.put(Race.Human, Human::new);
        creatures.put(Race.Human.getLeader(), Mage::new);

        creatures.put(Race.DarkElf, DarkElf::new);
        creatures.put(Race.DarkElf.getLeader(), DemonSlayer::new);
    }
}