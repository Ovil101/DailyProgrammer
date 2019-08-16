/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pii6j/difficult_challenge_1/
 * Created: 7/2/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package challenge1;
import java.util.Scanner;
import java.util.Random;

public class Challenge1Hard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int upper = 100;
        int lower = 0;
        boolean found = false;
        while (!found){
            int guess = random.nextInt((upper-lower)+1)+lower;
            System.out.println("Is your number "+guess+"?"+"(Y/H/L)");
            String ans = scan.next();
            if (ans.equals("Y") || ans.equals("y")){
                System.out.println("Yay!");
                found = true;
            }
            else if(ans.equals("H") || ans.equals("h")){
                lower = guess;
            }
            else if(ans.equals("L") || ans.equals("l")){
                upper = guess;
            }
        }
    }
}
