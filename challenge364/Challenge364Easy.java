/**
 * @author Ryan Lioy
 * @version 6/19/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/
 */
package challenge364;

import helper.Dice;

import java.util.Random;
import java.util.Scanner;

public class Challenge364Easy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int sides = Integer.parseInt(s.substring(0, s.indexOf('d')));
        Dice di = new Dice(sides);
        int sum = 0;
        int rolls = Integer.parseInt(s.substring(s.indexOf('d') + 1));
        Random rand = new Random();
        for (int i = 0; i < rolls; i++) {
            sum += rand.nextInt(sides) + 1;
        }
        System.out.println(sum);
    }
}
