package ru.mivr.zero;

import ru.mivr.second.access.pub.Parent;
import ru.mivr.second.access.util.LoggerUtil;

/**
 * Создание простейшего класса и его запуск
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Привет " + args[0]);

        Parent parent = new Parent();
        LoggerUtil.logSomeNumber(parent.getSomePublicProp());
    }
}
