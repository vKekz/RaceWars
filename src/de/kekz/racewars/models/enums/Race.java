package de.kekz.racewars.models.enums;

/**
 * Represents the race of a creature.
 */
public enum Race {
    Farseer(),
    Orc(150, Farseer),

    Lich(),
    Undead(70, Lich),

    Mage(),
    Human(110, Mage),

    DemonSlayer(),
    DarkElf(145, DemonSlayer);

    private int cost;
    private int leaderCost;
    private Race leader;

    Race() {
    }

    Race(int cost, Race leader) {
        this.cost = cost;
        this.leader = leader;
        this.leaderCost = cost * 2;
    }

    /**
     * Returns the cost for the race.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Returns the race leader.
     */
    public Race getLeader() {
        return leader;
    }

    /**
     * Returns the cost for a leader.
     */
    public int getLeaderCost() {
        return leaderCost;
    }
}
