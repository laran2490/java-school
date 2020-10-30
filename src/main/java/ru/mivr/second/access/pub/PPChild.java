package ru.mivr.second.access.pub;

class PPChild extends Parent {

    void change() {
        somePublicProp = 1;
        somePackagePrivateProp = 2;
        someProtectedProp = 3;
    }

    @Override
    int getSomePackagePrivateProp() {
        return 5;
    }


    @Override
    public int getSomePublicProp() {
        return 4;
    }

    @Override
    protected int getSomeProtectedProp() {
        return 5;
    }
}
