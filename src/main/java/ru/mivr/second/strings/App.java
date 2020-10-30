package ru.mivr.second.strings;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * преобразование строк в числа и обратно
 */
public class App {
    public static void main(String[] args) {
        String numStr = "123";

//        int intNum = (Integer) numStr;//can't just cast

        Integer valueOf = Integer.valueOf(numStr);
        int parseInt = Integer.parseInt(numStr);
        System.out.println(parseInt);
        String parseInt1 = "" + parseInt;

        byte parseByte = Byte.parseByte(numStr);
        System.out.println(parseByte);

        short parseShort = Short.parseShort(numStr);
        System.out.println(parseShort);
        //...

        BigInteger bigInteger = new BigInteger(numStr);
        System.out.println(bigInteger);
        BigDecimal bigDecimal = new BigDecimal(numStr);
        System.out.println(bigDecimal);
    }
}
