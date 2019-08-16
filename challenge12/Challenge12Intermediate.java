/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pxrzh/2202012_challenge_12_intermediate/
 * Created: 7/20/17
 * Modified: 7/21/17
 * Author: Ryan Lioy
 * Note: Only returns 2 factors
 */
package Challenge12;
import java.util.Scanner;
public class Challenge12Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer to factor: ");
        int i = scan.nextInt();
        System.out.println(factor(i));
    }
    public static String factor(int i){
        int low = 0;
        int high = 0;
        for (int j = i-1; j >= 2; j--){
            if  (i%j==0){
                high = j;
                break;
            }
        }
        for (int j = 2; j < i; j++){
            if (i%j==0){
                low = j;
                break;
            }
        }
        if (low == 0 && high == 0){ //if it is prime
            high = i;
            low = 1;
        }
        return i+" = "+low+" * "+high;
    }
}
