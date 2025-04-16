package de.kekz.racewars.creatures.enums;

public enum Race
{
    Orc(150),
    Undead(70),
    Human(110),
    DarkElf(145);

    final int cost;

    Race(int cost)
    {
        this.cost = cost;
    }

    public int getCost()
    {
        return cost;
    }
}
