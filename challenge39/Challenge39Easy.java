/**
 * @author Ryan Lioy
 * @version 8/24/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/s6bas/4122012_challenge_39_easy/
 */
package Challenge39;
import java.util.Scanner;
public class Challenge39Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        fizzbuzz(scan.nextInt());
    }
    public static void fizzbuzz(int n){
        for (int i = 1; i <= n; i++){
            if (i%5 == 0 && i%3 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i%3 == 0 && !(i%5 == 0)){
                System.out.println("fizz");
            }
            else if (i%5 == 0 && !(i%3 == 0)){
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}