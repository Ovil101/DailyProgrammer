/**
 * @author Ryan Lioy
 * @version 8/21/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rmmn8/3312012_challenge_34_easy/
 */
package Challenge34;
import java.util.Arrays;
import java.util.Scanner;
public class Challenge34Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(squareSum(array[0],array[1]));
    }
    public static int squareSum(int a, int b){
        return (int) Math.pow((double)a+b,2);
    }
}