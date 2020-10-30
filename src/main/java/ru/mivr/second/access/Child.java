package ru.mivr.second.access;

import ru.mivr.second.access.pub.Parent;

public class Child extends Parent {
    private int somePrivateProp;

    @Override
    protected int getSomeProtectedProp() {
        return somePrivateProp;
    }

}
