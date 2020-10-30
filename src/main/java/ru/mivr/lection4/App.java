package ru.mivr.lection4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Описание
 */
public class App {

    public static void main(String[] args) {

        /*int i = 7687;
        switch (i) {
            case 1:
                System.out.println("Curr value: 1");
                break;
            case 2:
                System.out.println("Crr: 2");
                break;
            case 0:
            default:
                System.out.println("000000000!!!!!");
                System.out.println("Default value");
                break;

        }

        int c = ((i == 0) && (i < 10)) ? 10 : 20;
        final int k = i == 0 ? 123 : 12;



        if (i == 0) {
        } else if (i == 1) {

        } else if (i == 2) {

        } else if (i == 3) {

        } else {

        }*/

        int i1 = 0;

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object());
        MyIndexBeach myIndexBeach = new MyIndexBeach();

        AtomicInteger atomicInteger = new AtomicInteger();

        objects.forEach(asdfasd -> {
            myIndexBeach.increment();

            int i2 = myIndexBeach.get();

            int i3 = atomicInteger.incrementAndGet();

        });

    }

    private static class MyIndexBeach {
        private int index = 0;

        private void increment() {
            index++;
        }

        private int get() {
            return index;
        }
    }
}
