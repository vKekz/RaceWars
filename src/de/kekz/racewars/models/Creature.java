package de.kekz.racewars.models;

import de.kekz.racewars.models.enums.Race;

/**
 * Represents the base class of a creature.
 */
public abstract class Creature {
    private final Race race;
    private double health;
    private final double armor;
    private final double damage;
    private final double speed;

    /**
     * Initializes a new instance of the {@link Creature} class.
     */
    protected Creature(Race race, double health, double armor, double damage, double speed) {
        this.race = race;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;

        if (this instanceof ILeader leader) {
            this.health *= leader.getBonus();
        }
    }

    @Override
    public String toString() {
        return (this instanceof ILeader ? race.getLeader().name() : "") + " " + race.name() + " [" + health + "]";
    }

    /**
     * Logic for when the given enemy is attacked. Returns the dealt damage, otherwise 0 if the enemy is not alive or a ghost.
     */
    public double attack(Creature enemy) {
        if (!enemy.isAlive() || enemy.getRace() == Race.Ghost) {
            return 0;
        }

        double damage = speed * this.damage;
        if (race == Race.Ghost) {
            damage = 1D;
        }

        if (this instanceof ILeader leader) {
            // Make sure to consider leader bonus
            damage *= leader.getBonus();

            // When leaders are attacking each other, the superior element deals double damage
            if (enemy instanceof ILeader enemyLeader && leader.getElement().isSuperiorTo(enemyLeader.getElement())) {
                damage *= 2D;
            }
        }

        // Finally calculate damage reduction
        double finalDamage = calculateDamageReduction(damage);
        enemy.health -= finalDamage;

        return finalDamage;
    }

    /**
     * Returns true if the health is greater than 0.
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Calculates the damage reduction and returns the new damage.
     */
    private double calculateDamageReduction(double damage) {
        // Human damage reduction
        damage *= race == Race.Human ? 0.9D : 1D;

        // Armor damage reduction
        damage *= 1D - armor;

        return damage;
    }

    /**
     * Returns the creature's race.
     */
    public Race getRace() {
        return race;
    }
}
