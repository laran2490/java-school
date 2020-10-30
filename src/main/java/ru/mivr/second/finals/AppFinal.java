package ru.mivr.second.finals;

/**
 * ключевое слово final
 */
public final class AppFinal {

    private static final int STATIC_CONSTANT; //can't be changed
    public static final int PUB_CONS = 20;

    private static final AbstractSong STATIC_OBJ_CONSTANT = new SubSong("sdfs");

    static {
        STATIC_CONSTANT = 10;
    }

    private final int constantField = 10; //can't be changed

    private final SubSong song = new SubSong("asdasd");

    public static void main(String[] args) {
        final int constantVariable = 1; //can't be changed

        STATIC_OBJ_CONSTANT.doSomething();

        int cb = 2;

        AppFinal appObject = new AppFinal();
        appObject.song.showMustGoOn();

        //effectively final - переменные, которые не изменяются после создания на протяжении блока кода
        /*final int effFinalProp = 3;
        final int notEffFinalProp = 4;

        if (effFinalProp == 3) {
            notEffFinalProp = 4;
        }

        Optional.of(appObject).ifPresent(ap -> {
            System.out.println(effFinalProp);
            System.out.println(notEffFinalProp);
        });*/

        final int[] arr = {1, 2, 3, 5};
//        arr = new int[5]; //can't change the link
        arr[3] = 4; //easy
    }

    public final int getConstantField() {
        return constantField;
    }

    public static final int getConst() {
        return STATIC_CONSTANT;
    }

}

abstract class AbstractSong { //can't be final

    public void doSomething() {
        int c = 25;

        int bestIntEver = makeTheBestIntEver();

        System.out.println(c + bestIntEver);
    }

    protected abstract int makeTheBestIntEver();

    public final void showMustGoOn() {
        System.out.println("Queen (c)");
    }
}

class SubSong extends AbstractSong {
    //can't override showMustGoOn

    private final String appName;

    public SubSong(String appName) {
        this.appName = appName;
    }

    @Override
    protected int makeTheBestIntEver() {
        return 0;
    }
}

class SingleSong extends AbstractSong {
    private final int theBestSingleSongIntEver;

    public SingleSong(int theBestSingleSongIntEver) {
        this.theBestSingleSongIntEver = theBestSingleSongIntEver;
    }

    @Override
    protected int makeTheBestIntEver() {
        return theBestSingleSongIntEver;
    }
}


