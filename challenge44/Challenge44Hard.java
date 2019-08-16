/**
 * @author Ryan Lioy
 * @version 4/3/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/srp5q/4252012_challenge_44_difficult/
 * I have no idea how long this will take to finish finding the answer, but it does the 9! and 8! one in 5-6 seconds
 */

package Challenge44;

public class Challenge44Hard {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        factor((long) 2.092279e+13, 3628800); //?????????
        //factor(362880,40320); //5-6 seconds
        long b = System.currentTimeMillis();
        System.out.println("TIME: "+(b-a)/1000.0);
    }
    public static void factor(long a, long b) {
        long sum = 0;
        int count = 0;
        for (long i = a; i < a + b; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }
        System.out.println("SUM: " + sum);
        System.out.println("COUNT: " + count);
    }

    public static boolean isPrime(long n) {
        long k = n%10;
        if (n==1){
            return false;
        }
        if (n == 2 || n == 5 || n==7) {
            return true; //2 and 5 are prime
        }
        if (k==1 || k==3 || k==7 || k==9){ //all primes (except 2/5/7) end in these numbers
            for (long i = 7; i < n/2; i+=2) { //counts by twos because evens cant be prime
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}