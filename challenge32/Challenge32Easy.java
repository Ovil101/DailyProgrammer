/**
 * @author Ryan Lioy
 * @version 8/12/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/red6f/3262012_challenge_30_intermediate/
 */
package Challenge32;
import java.util.Random;
import java.util.Scanner;
public class Challenge32Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter a number(0-36): ");
        int n = scan.nextInt();
        System.out.print("Enter your bet: ");
        int bet = scan.nextInt();
        int r = random.nextInt(37)+1;
        System.out.println("Winning number: "+r);
        if (n == r){
            bet *= 35;
            System.out.println("You win $"+bet);
        }
        else{
            System.out.println("You lose!");
        }
    }
}