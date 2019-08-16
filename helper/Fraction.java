package helper;

/**
 * Class for doing fractional math
 */
public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    /**
     * Constructs a Fraction object with passed properties.
     *
     * @param numerator   number to go into the numerator of object.
     * @param denominator number to go into the denominator of the object.
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (denominator < 0) { //keeping the negative in the numerator
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * Constructs a Fraction representing an integer.
     *
     * @param n Integer to be the numerator.
     */
    public Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    /**
     * Constructs an "empty" Fraction.
     */
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    /**
     * Constructs a Fraction object from a string.
     *
     * @param fraction String to be converted to a Fraction object in the format numerator/denominator.
     */
    public Fraction(String fraction) {
        int index = fraction.indexOf('/');
        if (index == -1) {
            throw new IllegalArgumentException("Argument not in readable format");
        }
        numerator = Integer.parseInt(fraction.substring(0, index));
        denominator = Integer.parseInt(fraction.substring(index + 1));
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    /**
     * Adds two Fraction objects together.
     *
     * @param b fraction to add to.
     * @return Sum of two Fractions.
     */
    public Fraction add(Fraction b) {
        int d = denominator;
        if (denominator == b.getDenominator()) { //common denominators
            return new Fraction(numerator + b.getNumerator(), denominator);
        } else { //different denominators
            numerator *= b.denominator;
            denominator *= b.denominator;
            b.setNumerator(b.getNumerator() * d);
            b.setDenominator(b.getDenominator() * d);
            return new Fraction(numerator + b.getNumerator(), denominator);
        }
    }

    /**
     * Converts a Fraction object to a String.
     *
     * @return A String in the format of numerator/denominator.
     */
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * Returns the numerator of a Fraction object.
     *
     * @return Numerator of a Fraction object.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator of a Fraction object.
     *
     * @return Denominator of a Fraction object.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Multiplies two Fractions together.
     *
     * @param b Fraction to multiply by.
     * @return Product of two Fractions.
     */
    public Fraction multiply(Fraction b) {
        return new Fraction(numerator * b.getNumerator(), denominator * b.getDenominator());
    }

    /**
     * Divides two Fractions.
     * <p>
     * Ex: (1/2)/(3/4) = (1/2)*(4/3) = 4/6 = 2/3.
     *
     * @param b Fraction to multiply by.
     * @return Product for two Fractions.
     */
    public Fraction divide(Fraction b) {
        return new Fraction(numerator, denominator).multiply(b.reciprocal()).simplify();
    }

    /**
     * Subtracts two Fraction objects by negating the later
     * Fraction and adds.
     *
     * @param b Fraction to subtract.
     * @return The difference between
     */
    public Fraction subtract(Fraction b) {
        return new Fraction(numerator, denominator).add(b.negate()).simplify();
    }

    /**
     * Determines if two Fractions are equal in contents
     *
     * @param object Fraction object to compare to.
     * @return True if equal, false otherwise.
     */
    @Override
    public boolean equals(Object object) { //thanks google
        if (object == null) {
            return false;
        }
        if (!Fraction.class.isAssignableFrom(object.getClass())) {
            return false;
        }
        Fraction b = (Fraction) object;
        return numerator == b.getNumerator() && denominator == b.getDenominator();
    }

    /**
     * Returns a simplified Fraction.
     *
     * @return A simplified Fractional representation
     * of passed Fraction, returns passed Fraction if
     * already simplified.
     */
    public Fraction simplify() {
        if (gcd(numerator, denominator) == 1) {
            return new Fraction(numerator, denominator);
        } else {
            int gcf = gcd(numerator, denominator);
            return new Fraction(numerator / gcf, denominator / gcf);
        }
    }

    /**
     * Raises a Fraction to the passed integer exponent.
     *
     * @param exp Integer exponent.
     * @return Fraction raised to the power of passed integer.
     */
    public Fraction pow(int exp) {
        numerator = (int) Math.pow((double)numerator, (double)exp);
        denominator = (int) Math.pow(denominator, exp);
        return new Fraction(numerator, denominator);
    }

    /**
     * Returns the reciprocal of a Fraction.
     *
     * @return Reciprocal of a Fraction object.
     */
    public Fraction reciprocal() {
        return makeNumeratorNegative(new Fraction(denominator, numerator));
    }

    /**
     * Returns a Fraction with the inverse sign.
     *
     * @return Fraction object with inverse sign.
     */
    public Fraction negate() {
        return new Fraction(numerator * -1, denominator);
    }

    /**
     * Returns the absolute value of a Fraction.
     *
     * @return Absolute value of a Fraction object.
     */
    public Fraction abs() {
        if (numerator < 0) {
            return new Fraction(numerator * -1, denominator);
        }
        return new Fraction(numerator, denominator);
    }

    /**
     * Returns Fraction value of two integers.
     * @param numerator   int to be numerator.
     * @param denominator int to be denominator.
     * @return Fraction value of numerator/denominator.
     */
    public static Fraction getFraction(int numerator, int denominator){
        if (denominator==0){
            throw new ArithmeticException("Zero in denominator");
        }
        return new Fraction(numerator,denominator);
    }

    /**
     * Used for comparing ArrayLists of Fractions.
     *
     * @param a Fraction object to compare to.
     * @return 1 if greater, -1 if less than, 0 if equal to.
     */
    public int compareTo(Fraction a) {
        double x = (double) numerator / denominator;
        double y = (double) a.getNumerator() / a.getDenominator();
        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1;
        }
        return 0;
    }

    /**
     * Finds the double value of a Fraction.
     *
     * @return double representation of a Fraction.
     */
    public double valueOf() {
        return (double) numerator / denominator;
    }

    //PRIVATE METHODS

    /**
     * Makes sure that a negative Fraction has a negative numerator and positive denominator.
     *
     * @param a Fraction to check.
     * @return Returns Fraction with negative numerator if the denominator is negative, else returns passed value.
     */
    private static Fraction makeNumeratorNegative(Fraction a) {
        if (a.getDenominator() < 0) {
            return new Fraction(a.getNumerator() * -1, a.getDenominator() * -1);
        }
        return a;
    }

    /**
     * Used for simplifying Fractions.
     *
     * @param a Denominator of first Fraction.
     * @param b Denominator of second Fraction.
     * @return The greatest common denominator.
     */
    private int gcd(int a, int b) {
        int factor;
        while (b != 0) {
            factor = b;
            b = a % b;
            a = factor;
        }
        return a;
    }

    /**
     * Set the numerator of a Fraction.
     *
     * @param a Integer to set numerator to.
     */
    private void setNumerator(int a) {
        numerator = a;
    }

    /**
     * Set the denominator of a Fraction.
     *
     * @param a Integer to set denominator to.
     */
    private void setDenominator(int a) {
        denominator = a;
    }
}
