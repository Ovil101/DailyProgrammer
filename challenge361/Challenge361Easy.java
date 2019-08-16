/**
 * @author Ryan Lioy
 * @version 5/19/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/8jcffg/20180514_challenge_361_easy_tally_program/
 */
package Challenge361;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge361Easy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[5];
        char[] array = scan.nextLine().toCharArray();
        for (char x : array) {
            switch (x) {
                case 'a':
                    scores[0]++;
                    break;
                case 'b':
                    scores[1]++;
                    break;
                case 'c':
                    scores[2]++;
                    break;
                case 'd':
                    scores[3]++;
                    break;
                case 'e':
                    scores[4]++;
                    break;
                case 'A':
                    scores[0]--;
                    break;
                case 'B':
                    scores[1]--;
                    break;
                case 'C':
                    scores[2]--;
                    break;
                case 'D':
                    scores[3]--;
                    break;
                case 'E':
                    scores[4]--;
                    break;
            }
        }
        Arrays.sort(scores);
        ArrayUtils.reverse(scores);
        System.out.println(scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + scores[4]);
    }
}
