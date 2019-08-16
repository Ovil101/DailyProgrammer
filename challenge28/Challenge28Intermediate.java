/**
 * @author Ryan Lioy
 * @version 8/9/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/r59e6/3202012_challenge_28_intermediate/
 */
package Challenge28;
import java.util.Scanner;
import java.math.BigInteger;
public class Challenge28Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of balls: ");
        BigInteger n = new BigInteger(scan.next());
        n = n.multiply(n.add(BigInteger.valueOf(1))).multiply(n.add(BigInteger.valueOf(2))).divide(BigInteger.valueOf(6));
        System.out.println(n);
    }
}