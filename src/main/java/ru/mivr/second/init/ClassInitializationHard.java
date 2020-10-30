package ru.mivr.second.init;

/**
 * Примеры особенностей инициализации классов
 */
public class ClassInitializationHard {
    public static class Upper {
        String upperString;

        public Upper() {
            Initializer.initialize(this);
        }
    }

    public static class Lower extends Upper {
        String lowerString = null;
//        String lowerString; //TODO: заменить и посмотреть что будет

        public Lower() {
            super();
            System.out.println("Upper:  " + upperString);
            System.out.println("Lower:  " + lowerString);
        }

        public static void main(final String[] args) {
            new Lower();
        }
    }

    public static class Initializer {
        static void initialize(final Upper anUpper) {
            if (anUpper instanceof Lower) {
                Lower lower = (Lower) anUpper;
                lower.lowerString = "lowerInited";
            }
            anUpper.upperString = "upperInited";
        }
    }
}
