package ru.mivr.second.object;

/**
 * Маааленькая сосна
 */
public class SmallPineTree extends PineTree {
    private boolean hasBigEgo = true;

    public boolean isHasBigEgo() {
        return hasBigEgo;
    }

    public void setHasBigEgo(boolean hasBigEgo) {
        this.hasBigEgo = hasBigEgo;
    }

    //todo: try to override migration

}
