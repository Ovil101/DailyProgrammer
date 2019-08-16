/**
 * @author Ryan Lioy
 * @version 2/19/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/6zvjre/20170913_challenge_331_intermediate_sum_of_digits/
 */
package Challenge331;
import java.math.BigInteger;
import java.util.Scanner;
public class Challenge331Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(sumOfDigits(new BigInteger(scan.nextLine()).pow(scan.nextInt()))); //because why not
    }
    public static long sumOfDigits(BigInteger num){
        long sum = 0;
        char[] array = num.toString().toCharArray();
        for (char c : array){
            sum+=Character.getNumericValue(c);
        }
        return sum;
    }
}