/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pzobz/2212012_challenge_13_difficult/
 * Created: 7/21/17
 * Modified: 7/21/17
 * Author: Ryan Lioy
 * Note: I believe this works
 */
package Challenge13;
import java.util.Random;
import java.util.Scanner;
public class Challenge13Hard {
    public static void main(String[] args){
        Random player1 = new Random();
        Random player2 = new Random();
        Scanner scan = new Scanner(System.in);
        int p1W = 0;
        int p2W = 0;
        int ties = 0;
        while (true){
            int choice1 = player1.nextInt(3)+1;
            int choice2 = player2.nextInt(3)+1;
            // 0 = rock
            // 1 = paper
            // 2 = scissors
            if (choice1 == 0 && choice2 == 2){ //p1 wins
                p1W++;
            }
            else if (choice1 == 2 && choice2 == 0){ //p2 wins
                p2W++;
            }
            else if (choice1 == 0 && choice2 == 1){ //p2 wins
                p2W++;
            }
            else if (choice1 == 1 && choice2 == 0){ //p1 wins
                p1W++;
            }
            else if (choice1 == 1 && choice2 == 2){ //p2 wins
                p2W++;
            }
            else if (choice1 == 2 && choice2 == 1){ //p1 wins
                p1W++;
            }
            else if (choice1 == 0 && choice2 == 0){ //tie
                ties++;
            }
            else if (choice1 == 1 && choice2 == 1){ //tie
                ties++;
            }
            else if (choice1 == 2 && choice2 == 2){ //tie
                ties++;
            }
            System.out.println("Player 1 wins: "+p1W);
            System.out.println("Player 2 wins: "+p2W);
            System.out.println("Ties: "+ties);
        }
    }
}