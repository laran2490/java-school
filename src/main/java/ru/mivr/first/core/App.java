package ru.mivr.first.core;


import ru.mivr.first.ButtonPhone;
import ru.mivr.first.Phone;
import ru.mivr.first.SmartPhone;
import ru.mivr.first.User;

/**
 * Очень осмысленный комментарий о работе данного класса
 */
public class App {
    public static void main(String[] args) {
        Phone buttonPhone = new ButtonPhone(1999, 3);
        Phone android = new SmartPhone(2020, 9, "Android");

        User vasya = new User("Вася", "3335522", android);
        User petya = new User("Петя", "8913", buttonPhone);

        vasya.callAnotherUser(petya);

        petya.callAnotherUser(vasya);

    }
}
