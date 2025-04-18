package de.kekz.racewars.models;

import de.kekz.racewars.models.enums.Element;
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

    private Element element = null;
    private double bonus = 1D;

    /**
     * Initializes a new instance of the {@link Creature} class.
     */
    protected Creature(Race race, double health, double armor, double damage, double speed) {
        this.race = race;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return (isLeader() ? race.getLeader().name() : "") + " " + race.name() + "[" + health + "]";
    }

    /**
     * Logic for when the given enemy is attacked. Returns the dealt damage, otherwise 0 if the enemy is not alive.
     */
    public double attack(Creature enemy) {
        if (!enemy.isAlive()) {
            return 0;
        }

        // Consider leader bonus in the calculation.
        double damage = speed * this.damage * bonus;

        // Check for the superior element, if leaders are attacking each other to deal double damage.
        if (isLeader() && enemy.isLeader() && isElementSuperior(enemy.element)) {
            damage *= 2D;
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
     * Marks the creature as a leader by giving it an element and bonus.
     */
    public void markAsLeader(Element element, double bonus) {
        this.element = element;
        this.bonus = bonus;

        // Make sure to give them more health depending on the bonus.
        this.health *= bonus;
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
     * Returns true if the current element is superior to the given one.
     */
    private boolean isElementSuperior(Element element) {
        return (this.element == Element.Fire && element == Element.Air) ||
                (this.element == Element.Water && element == Element.Fire) ||
                (this.element == Element.Earth && element == Element.Water) ||
                (this.element == Element.Air && element == Element.Earth);
    }

    /**
     * Returns true if this {@link Creature} is a leader.
     */
    private boolean isLeader() {
        return element != null && bonus > 1D;
    }

    /**
     * Returns the creature's race.
     */
    public Race getRace() {
        return race;
    }
}
