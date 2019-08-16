/**
 * @author Ryan Lioy
 * @version 8/26/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/s6be0/4122012_challenge_39_intermediate/
 */
package Challenge39;
import java.util.Scanner;
public class Challenge39Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer to test: ");
        System.out.println(kaprekar(scan.nextInt()));
    }
    public static boolean kaprekar(int n){
        //can we still call this a one liner?
        if (n == 1){
            return true;
        }
        if (n == 2 || n ==3){
            return false;
        }
        /* In case reading the return statement is making you suicidal:
        String s = String.valueOf((int)Math.pow(n,2));
        return Integer.parseInt(s.substring(0,(s.length()/2)))+Integer.parseInt(s.substring(s.length()/2)) == n;
        */
        return Integer.parseInt(String.valueOf((int)Math.pow(n,2)).substring(0,(String.valueOf((int)Math.pow(n,2)).length()/2)))+Integer.parseInt(String.valueOf((int)Math.pow(n,2)).substring(String.valueOf((int)Math.pow(n,2)).length()/2)) == n;
    }
}