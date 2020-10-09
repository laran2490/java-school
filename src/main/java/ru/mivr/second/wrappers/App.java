package ru.mivr.second.wrappers;


class A {
    int number;

    @Override
    public String toString() {
        return "A{" +
                "number=" + number +
                '}';
    }
}

/**
 * Классы обёртки
 */
public class App {
    public static void main(String[] args) {
        Integer wrappedInt = Integer.parseInt("1");
        Integer wrappedInt1 = new Integer(1);
        wrappedInt.hashCode();
        int i = new Integer(1);
        long l = wrappedInt.longValue();
        int simpleInt = 1;
        doSomethingWithMyInt(simpleInt, wrappedInt);

        // что будет?
//        System.out.println(simpleInt);
//        System.out.println(wrappedInt);

        Integer a = new Integer(0);
        Integer b = new Integer(0);
        b = a;
        a = 1;

        // что будет?
        System.out.println(b);

        String str = "234";

        int[] arr = {1, 2, 3};

        System.out.println(wrappedInt.equals(wrappedInt1));
        System.out.println(wrappedInt == simpleInt);


    }


    private static void doSomethingWithMyInt(int simple, Integer wrapped) {
        simple = 2;
        wrapped = 2;
    }
}
