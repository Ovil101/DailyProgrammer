/**
 * @author Ryan Lioy
 * @version 9/2/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/t78lv/542012_challenge_48_intermediate/
 */
package Challenge48;
import java.util.Scanner;
public class Challenge48Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[11];
        for (int i = 0; i < 11; i++){
            array[i] = scan.nextInt();
        }
        int[] arr = reverse(array);
        for (int i = 0; i < 11; i++){
            if (f(array[i])> 400){
                System.out.println("TO LARGE");
            }
            else{
                System.out.println(f(array[i]));
            }
        }
    }
    public static int[] reverse(int[] arr){ //why does Java not have this is Arrays?
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-(1+i)];
            arr[arr.length-(1+i)] = temp;
        }
        return arr;
    }
    public static double f(int n){
        return Math.pow(n,3)+5;
    }
}