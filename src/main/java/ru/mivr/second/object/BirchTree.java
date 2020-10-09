package ru.mivr.second.object;

/**
 * Берёза
 */
public class BirchTree extends AbstractTree {
    private final int blackStrips;

    public BirchTree(int blackStrips) {
        this(0, blackStrips);
    }

    public BirchTree(int age, int blackStrips) {
        super(age);
        this.blackStrips = blackStrips;
    }

    @Override
    public String toString() {
        return "Берёза с " + blackStrips + " полосками. " + super.toString();
    }
}
