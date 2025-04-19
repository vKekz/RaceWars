package de.kekz.racewars.models.enums;

/**
 * Represents the four elements a race leader can have.
 */
public enum Element {
    Air,
    Fire,
    Water,
    Earth;

    /**
     * Returns true if the current element is superior to the given one.
     */
    public boolean isSuperiorTo(Element element) {
        return (this == Element.Fire && element == Element.Air) ||
                (this == Element.Water && element == Element.Fire) ||
                (this == Element.Earth && element == Element.Water) ||
                (this == Element.Air && element == Element.Earth);
    }
}
