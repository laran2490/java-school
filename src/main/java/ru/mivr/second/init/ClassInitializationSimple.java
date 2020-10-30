package ru.mivr.second.init;

/**
 * Примеры особенностей инициализации классов
 */
public class ClassInitializationSimple {
    public static abstract class Animal {
        private final String fullName;

        protected Animal() {
            fullName = "Animal " + getName();
        }

        public String getFullName() {
            return fullName;
        }

        protected abstract String getName();
    }

    public static class Dog extends Animal {
        private String thisName = "DDog";

        protected String getName() {
            return thisName;
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.getFullName());
    }
}
