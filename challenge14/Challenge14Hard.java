/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/q2kbt/2232012_challenge_14_difficult/
 * Created: 7/23/17
 * Modified: 7/31/17
 * Author: Ryan Lioy
 * Note: This does not use threading, as I don't know how to use it.
 */
package Challenge14;
import java.util.Scanner;
import java.util.Random;
public class Challenge14Hard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int[] array = new int[scan.nextInt()];
        array = sort(assign(array));
        for (int i : array){
            System.out.println(i);
        }
    }
    public static int[] assign(int[] array){ //randomly assign numbers to array
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            int n = r.nextInt(1_000_000)+1;
            array[i] = n;
        }        
        return array;
    }
    public static int[] sort(int[] input){ //sorts an int array
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}