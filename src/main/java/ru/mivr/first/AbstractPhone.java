package ru.mivr.first;

public abstract class AbstractPhone implements Phone {
    private int year;
    protected int model;

    protected AbstractPhone(int year) {
        this.year = year;
    }
}
