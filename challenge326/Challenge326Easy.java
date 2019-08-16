/**
 * @author Ryan Lioy
 * @version 10/20/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/6s70oh/2017087_challenge_326_easy_nearest_prime_numbers/
 */
package Challenge326;
import java.util.Scanner;
public class Challenge326Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        lessThanGreaterThanPrime(scan.nextInt());
    }
    public static boolean isPrime(int n){ //brute force prime numbers ¯\_(ツ)_/¯
        if (n == 2){
            return true; //2 is prime
        }
        if (n % 2 == 0){
            return false; //must be even, so false, also catches 1
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void lessThanGreaterThanPrime(int n){ //unnecessarily long method name
        int large = 0, less = 0;
        if (isPrime(n)){
            System.out.print(n+" is prime.");
            System.exit(0);
        }
        else{
            for (int i = n; i > 0; i--){
                if (isPrime(i)){
                    less = i;
                    break;
                }
            }
            for (int i = n;; i++){
                if (isPrime(i)){
                    large = i;
                    break;
                }
            }
        }
        System.out.print(less+" < "+n+" < "+large);
    }
}