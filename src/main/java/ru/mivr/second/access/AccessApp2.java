package ru.mivr.second.access;

import ru.mivr.second.access.pub.Parent;
import ru.mivr.second.access.util.LoggerUtil;

public class AccessApp2 {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent2 = new Parent();

        LoggerUtil.logSomeNumber(Parent.getCounter());
    }
}
