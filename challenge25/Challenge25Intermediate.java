/**
 * @see https://www.reddit.com/r/dailyprogrammer/comments/qxvu2/3152012_challenge_25_intermediate/
 * @version 8/1/17
 * @author Ryan Lioy
 */
package Challenge25;
import java.util.Scanner;
public class Challenge25Intermediate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to convert to binary: ");
        System.out.println(Integer.toBinaryString(scan.nextInt())); //is this cheating?
    }
}