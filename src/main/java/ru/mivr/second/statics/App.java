package ru.mivr.second.statics;

class A {
    /**
     * Статическое поле: живёт всё время работы программы
     */
    static int staticA = 0;
    /**
     * Поле класса AppFinal: живёт столько, сколько живёт экземпляр класса (объект)
     */
    int objA = 0;

    int getStaticA() {
        return staticA;
    }

    int getObjA() {
        return objA;
    }

    void setStaticA(int newStaticA) {
        staticA = newStaticA;
    }

    void setObjA(int newObjA) {
        objA = newObjA;
    }
}

/**
 * Примитивы
 */
public class App {

    public static void main(String[] args) {

        System.out.println("staticA: " + A.staticA);
        A.staticA = 1;
        System.out.println("staticA: " + A.staticA);
        System.out.println("");

        A a = new A();
        a.setObjA(2);
        System.out.println("onjA1: " + a.getObjA());
        System.out.println("staticA1: " + a.getStaticA());

        System.out.println("");

        A a1 = new A();
        a1.setObjA(3);
        System.out.println("onjA2: " + a1.getObjA());
        System.out.println("staticA2: " + a1.getStaticA());
        System.out.println("staticA: " + A.staticA);

        System.out.println("onjA1: " + a.getObjA());
        System.out.println("staticA1: " + a.getStaticA());
    }
}
