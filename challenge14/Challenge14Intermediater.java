/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/q2mwu/2232012_challenge_14_intermediate/
 * Created: 7/22/17
 * Modified: 7/23/17
 * Author: Ryan Lioy
 */
package Challenge14;
import java.util.Scanner;
public class Challenge14Intermediater {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        primes(scan.nextInt());        
    }
    public static void primes(int limit){
        boolean[] prime = new boolean[limit];
        for (int i = 1; i < limit/2; i++){
            for (int j = i; j <= ((limit/2)-i)/(2*i+1);j++){
                prime[i+j+2*i*j] = true;
            }
        }
        System.out.println("2\n3"); //since it excludes 2 and 3
        for (int i = 2; i < prime.length/2; i++){
            if (!prime[i]){ //if false
                System.out.println(2*i+1);
            }
        }     
        System.out.println();
    }
}