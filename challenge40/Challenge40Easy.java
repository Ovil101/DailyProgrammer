/**
 * @author Ryan Lioy
 * @version 8/27/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/schtf/4162012_challenge_40_easy/
 */
package Challenge40;
import java.util.Scanner;
public class Challenge40Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer: ");
        printRange(1, scan.nextInt());
    }
    public static void printRange(int n, int end){
        try{
            int test = 1/((end-n)+1);
            System.out.println(n);
            printRange(n+1, end);
        }
        catch(ArithmeticException e){
            System.exit(0);
        }
    }
}