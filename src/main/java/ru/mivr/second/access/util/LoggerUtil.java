package ru.mivr.second.access.util;

/**
 * Описание
 */
public class LoggerUtil {

    public static void logSomeNumber(int i) {
        if (i != 0) {
            System.out.println(i);
        }
    }

    public static void logSomeString(String str) {
        if (str != null) {
            System.out.println(str);
        }
    }
}
