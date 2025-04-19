package de.kekz.racewars.creatures;

import de.kekz.racewars.models.Creature;
import de.kekz.racewars.models.enums.Race;

import java.util.HashMap;
import java.util.function.Supplier;

public final class CreatureRegistry {
    private static final HashMap<Race, Supplier<Creature>> creatures = new HashMap<>(Race.values().length);

    /**
     * Initializes a new instance of the {@link CreatureRegistry} class.
     */
    public CreatureRegistry() {
        registerCreatures();
    }

    /**
     * Returns a new creature instance given by the race.
     */
    public Creature getCreatureByRace(Race race) {
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
