package challenge365;

import java.math.BigInteger;

public class Challenge365Easy {
    public static void main(String[] args) {
        /*
        Commented lines should work but take a long time.
         */
        //System.out.println(arrowNotation(BigInteger.valueOf(5), BigInteger.valueOf(4), BigInteger.valueOf(5)));
        //System.out.println(arrowNotation(BigInteger.valueOf(7), BigInteger.valueOf(5), BigInteger.valueOf(3)));
        System.out.println(arrowNotation(BigInteger.valueOf(-1), BigInteger.valueOf(3), BigInteger.valueOf(3)));
        System.out.println(arrowNotation(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(0)));
        System.out.println(arrowNotation(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(0)));
        //System.out.println(arrowNotation(BigInteger.valueOf(12), BigInteger.valueOf(11), BigInteger.valueOf(25)));
    }

    public static BigInteger arrowNotation(BigInteger a, BigInteger n, BigInteger b) {
        BigInteger result = a;
        if (n.equals(BigInteger.ONE)) {
            return pow(a, b);
        }
        for (int i = 0; i < Integer.parseInt(b.toString()) - 1; i++) {
            result = arrowNotation(a, n.subtract(BigInteger.ONE), result);
        }
        return result;
    }

    public static BigInteger pow(BigInteger a, BigInteger b) { //because BigInteger's implementation
        BigInteger result = BigInteger.ONE;                    //requires b as an int
        for (BigInteger i = BigInteger.ZERO; i.compareTo(b) < 0; i = i.add(BigInteger.ONE)) { //sorry
            result = result.multiply(a);
        }
        return result;
    }
}


