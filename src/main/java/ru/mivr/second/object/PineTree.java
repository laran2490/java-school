package ru.mivr.second.object;

import java.util.Objects;

/**
 * Сосна
 */
public class PineTree extends AbstractTree {
    private String growRegion;

    public PineTree() {
    }

    public PineTree(String growRegion) {
        this.growRegion = growRegion;
    }

    public String getGrowRegion() {
        return growRegion;
    }

    public final void migration(String newRegion) {
        growRegion = newRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PineTree pineTree = (PineTree) o;
        return Objects.equals(growRegion, pineTree.growRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), growRegion);
    }

    /*@Override
    public String toString() {
        return "сосна: " + growRegion;
    }*/

}
