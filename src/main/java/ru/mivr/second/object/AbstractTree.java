package ru.mivr.second.object;

import java.util.Objects;

/**
 * Абстрактное дерево
 */
public abstract class AbstractTree implements Tree {
    private int age;

    protected AbstractTree() {
        //todo: убрать конструктор и посмотреть что будет
    }

    protected AbstractTree(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        //TODO: сделать так чтобы указывалось соответствующее: год, года, лет
        return "возраст: " + age;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractTree that = (AbstractTree) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
