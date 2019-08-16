/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pjsdx/difficult_challenge_2/
 * Created: 7/2/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package Challenge3;
import java.util.Scanner;

public class Challenge3Easy{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the shift:");
        int i = scan.nextInt();
        System.out.println("Enter a phrse to encrypt");
        String s = scan.next();
        String encoded = encrypt(s,i);
        System.out.println("ENCRYPT: "+encoded);
        System.out.println("DECRYPT: "+decrypt(encoded,i));
    }
    private static String encrypt(String str, int shift){
        StringBuffer result = new StringBuffer(str.length());     
        char array[] = str.toCharArray();
        for (char c : array){
            c += shift;
            result.append(c);
        }
        return result.toString();  
    }
    private static String decrypt(String str, int shift){
        StringBuffer result = new StringBuffer(str.length());     
        char array[] = str.toCharArray();
        for (char c : array){
            c -= shift;
            result.append(c);
        }
        return result.toString();  
    }
}