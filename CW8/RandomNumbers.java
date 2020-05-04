package CW7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;

final class RandomNumbers {
    private static Random generator= new Random();

    public static int nextInt(int min, int max){
        return generator.nextInt((max-min)+1)+min;
    }
    public static int nextEvent(int min, int max){
        min=min % 2 == 1 ? min+1: min;
        max=max % 2 == 1 ? max+1: max;
       return min+ generator.nextInt((max-min)/2)*2;
    }
public static BigDecimal randomElement(List<BigDecimal> list){
    BigDecimal k = new BigDecimal((BigInteger) list);
    BigDecimal randFromInteger = new BigDecimal(Math.random());
    BigDecimal t = randFromInteger.multiply((BigDecimal) list);
    t = t
            .setScale(2, BigDecimal.ROUND_DOWN);
    return t;

}

}


