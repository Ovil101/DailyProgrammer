/**
 * @author Ryan Lioy
 * @version 8/1/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/qxuug/3152012_challenge_25_easy/
 */
package Challenge25;
import java.util.Scanner;
public class Challenge25Easy {
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter votes for candidate one: ");
        int first = scan.nextInt();
        System.out.println("Enter votes for candidate two: ");
        int second = scan.nextInt();
        int w = elect(first, second);
        switch (w){
            case 1:
                System.out.println("Canidate one wins!");
                break;
            case 2:
                System.out.println("Canidate two wins!");
                break;
            case -1:
                System.out.println("It's a draw!");
                break;
        }
    }
    public static int elect(int one, int two){
        if (one > two){
            return 1;
        }
        else if (one < two){
            return 2;
        }
        return 0;
    }
}