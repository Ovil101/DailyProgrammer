/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/qnkro/382012_challenge_20_easy/
 * Created: 7/24/17
 * Modified: 7/24/17
 * Author: Ryan Lioy
 */
package Challenge20;
import java.util.Scanner;
public class Challenge20Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){ //checks if number is prime
        if (n == 1){
            return false;
        }
        if(n == 2){
            return true; //2 is prime
        }
        if (n % 2 == 0){
            return false; //must be even, so false
        }
        for (int i = 2; i < n; i++){ 
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}