/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pm6oj/2122012_challenge_4_easy/
 * Created: 7/3/17
 * Modified: 7/3/17
 * Author: Ryan Lioy
 */
package Challenge4;
import java.util.Scanner;
import java.util.Random;

public class Challenge4Easy{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many passwords do you want to output?");
        int n = scan.nextInt();
        System.out.println("What length should the passwords have?");
        int l = scan.nextInt();
        String[] passwords = passwords(n,l);
        for (int i = 0; i < passwords.length; i++){
            System.out.println(passwords[i]);
        }    
    }
    public static String[] passwords(int times, int length){
        String[] passwords = new String[times];
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
        for (int i = 0; i < times; i++){
            StringBuilder build = new StringBuilder();
            for (int j = 0; j < length; j++){
                int c = rand.nextInt(chars.length());
                build.append(chars.charAt(c));
            }
            passwords[i] = build.toString();
        }
        return passwords;
    }
}