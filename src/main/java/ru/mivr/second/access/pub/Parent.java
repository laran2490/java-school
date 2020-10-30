package ru.mivr.second.access.pub;

/**
 * Публичный класс, виден везде
 */
public class Parent {
    private static int instanceClassCounter;

    public String str;

    public Parent() {
        instanceClassCounter++;
    }

    /**
     * Публичное поле видно везде
     */
    public int somePublicProp;

    /**
     * protected поле видно только наследникам и внутри пакета
     */
    protected int someProtectedProp;

    /**
     * package-private поле видно внутри пакета
     */
    int somePackagePrivateProp;

    /**
     * private поле не видно никому, кроме самого класса
     */
    private int somePrivateProp;

    public int getSomePublicProp() {
        return somePublicProp + getSomePrivateProp() + instanceClassCounter;
    }

    public Parent setSomePublicProp(int somePublicProp) {
        this.somePublicProp = somePublicProp;
        return this;
    }

    public void setSomePrivateProp(int somePrivateProp) {
        this.somePrivateProp = somePrivateProp;
    }

    protected int getSomeProtectedProp() {
        return someProtectedProp + getSomePrivateProp();
    }

    int getSomePackagePrivateProp() {
        return somePackagePrivateProp;
    }

    private int getSomePrivateProp() {
        return somePrivateProp + 1;
    }

    public int getInstanceClassCounter() {
        return instanceClassCounter;
    }

    public static int getCounter() {
        return instanceClassCounter;
    }
}
