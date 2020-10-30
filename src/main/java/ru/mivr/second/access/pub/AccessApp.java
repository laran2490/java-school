package ru.mivr.second.access.pub;

public class AccessApp {

    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.somePublicProp = 1;
        parent.somePublicProp = 2;
        parent.someProtectedProp = 2;
        parent.somePackagePrivateProp = 3;

        int somePackagePrivateProp = parent.getSomePackagePrivateProp();
        int somePublicProp = parent.getSomePublicProp();
        int someProtectedProp = parent.getSomeProtectedProp();

        System.out.println(parent.somePublicProp);
    }
}
