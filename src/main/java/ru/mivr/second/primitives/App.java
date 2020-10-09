package ru.mivr.second.primitives;

/**
 * Примитивы
 */
public class App {

    private static void tmpChanger(int tmp2) {
        tmp2 = 2;
    }

    public static void main(String[] args) {

        int tmp = 1;
        tmpChanger(tmp);
        System.out.println(tmp);

        //byte: [-128, 127]
        /*byte minByteValue1 = (byte) 0b1000_0000;
        byte minByteValue2 = (byte) 128;
        byte maxByteValue1 = (byte) 0b0111_1111;
        byte maxByteValue2 = (byte) 127;

        System.out.println(minByteValue1);
        System.out.println(minByteValue2);
        System.out.println(maxByteValue1);
        System.out.println(maxByteValue2);*/

        //  DANGER
        /*for (byte i = 1; i <= 200; i++) {
            System.out.println(i);
        }*/

        // short: [-32768, 32767]
//        short sh1 = 1;

        // int: [-2^31, 2^31 – 1]
        byte a = 1;
        byte b = 2;
//        byte result = (byte) (a + b);

        /*int value = 4;
        System.out.println(8/value);
        System.out.println(9/value);
        System.out.println(10/value);
        System.out.println(11/value);*/

        // long: [-2^63, 2^63 – 1]
        /*long longValue = 4;
        longValue = 1;
        longValue = 2L;
        printLongSimple(longValue);
        printLongWrapped(longValue);
        printLongSimple(4);
        printLongWrapped(4L);*/

        float floatValue1 = 2.3F; //lossy conversion from double to float

        /*float floatValue = 2.3F;
        floatValue = 2.3f;
        System.out.println(floatValue);
        double doubleValue = 2.3;
        System.out.println(doubleValue);
        double cinema = 7D;*/

        /*float piValue = (float) Math.PI;
        double piValueExt = Math.PI;
        System.out.println("Float value: " + piValue);
        System.out.println("Double value: " + piValueExt);*/

        /*float amount = 1.00000005F; // todo: add 0 before 5
        float avalue = 0.00000004F; // todo: add 0 before 4
        float result = amount - avalue;
        System.out.println(result);*/

       /* double positive_infinity = 12.0 / 0;
        System.out.println(positive_infinity);

        double positiveInfinity2 = 12.0 / 0;
        double negativeInfinity = -15.0 / 0;
        System.out.println(positiveInfinity2 + negativeInfinity);*/

        // boolean


        // char
        /*char symbol = '\u0066'; // Unicode
        System.out.println(symbol);
        symbol = 102; // ASCII
        System.out.println(symbol);*/

        /*String costForPrint = "5$";
        System.out.println("Цена только для вас " + costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));*/
    }

    private static void printLongSimple(long longValue) {
        System.out.println(longValue);
    }

    private static void printLongWrapped(Long longValue) {
        System.out.println(longValue);
    }

    private static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
