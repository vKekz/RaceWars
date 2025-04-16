package de.kekz.racewars.creatures;

import de.kekz.racewars.creatures.enums.Element;
import de.kekz.racewars.creatures.enums.Race;

public abstract class Creature
{
    public final Race race;

    // TODO: Set final
    public Element element = null;
    public double bonus = 1D;

    public double health;
    public final double armor;
    public final double damage;
    public final double speed;

    protected Creature(Race race, double health, double armor, double damage, double speed)
    {
        this.race = race;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;
    }

    public double attack(Creature enemy) {
        if (!enemy.isAlive()) {
            return 0;
        }

        double damage = this.speed * this.damage * this.bonus;
        if (isBoss() && enemy.isBoss()) {

            Element enemyElement = enemy.element;
            if ((this.element == Element.Fire && enemyElement == Element.Air) ||
                (this.element == Element.Water && enemyElement == Element.Fire) ||
                (this.element == Element.Earth && enemyElement == Element.Water) ||
                (this.element == Element.Air && enemyElement == Element.Earth)) {
                damage *= 2D;
            }
        }

        double armoredDamage = damageReduction(damage) * (1D - this.armor);
        enemy.health -= armoredDamage;

        return armoredDamage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    private double damageReduction(double damage) {
        return damage * (this.race == Race.Human ? 0.9D : 1D);
    }

    private boolean isBoss() {
        return this.element != null && this.bonus > 1D;
    }
}
