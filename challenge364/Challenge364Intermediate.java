/**
 * @author Ryan Lioy
 * @version 8/7/2018
 * @see https://www.reddit.com/r/programminghelp/comments/94wtgn/calculating_ducci_sequence_lengths/
 */
package challenge364;

import java.util.Arrays;
import java.util.HashSet;

public class Challenge364Intermediate {
    public static void main(String[] args) { //todo implement catching repeating patterns
        int[][] tests = {{0, 653, 1854, 4063},
                        {1, 5, 7, 9, 9},
                        {1, 2, 1, 2, 1, 0},
                        {10, 12, 41, 62, 31, 50},
                        {10, 12, 41, 62, 31}};
        for (int[] i : tests) {
            System.out.println(ducci(i));
        }
    }

    public static int ducci(int[] array) {
        int steps = 1;
        HashSet<String> list = new HashSet<>();
        while (!Arrays.equals(array, new int[array.length])) {
            final int first = array[0]; //cache of the first index for testing later
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = Math.abs(array[i] - array[i + 1]);
            }
            array[array.length - 1] = Math.abs(first - array[array.length - 1]);
            if (!list.add(Arrays.toString(array))) {
                steps++;
                break;
            }
            list.add(Arrays.toString(array));
            steps++;
        }
        return steps;
    }
}
