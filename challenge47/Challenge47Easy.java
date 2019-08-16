/**
 * @author Ryan Lioy
 * @version 9/1/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/t33vi/522012_challenge_47_easy/
 */
package Challenge47;
import java.util.Scanner;
public class Challenge47Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String s = scan.nextLine();
        System.out.print("Enter shift: ");
        int i = scan.nextInt();
        System.out.println(encrypt(s,i));
    }
    public static String encrypt(String s, int shift){
        final String alphaLower = "abcdefghijklmnopqrstuvwxyz";
        final String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUZWXYZ";
        StringBuilder encrypt = new StringBuilder(); // I am so sorry for lines 20-26
        StringBuilder alphaEncryptLower = new StringBuilder("abcdefghijklmnopqrstuvqxyz");
        StringBuilder t = alphaEncryptLower.delete(0, shift);
        alphaEncryptLower.insert(0,t);
        StringBuilder alphaEncryptUpper = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUZWXYZ");
        t = alphaEncryptUpper.delete(0, shift);
        alphaEncryptUpper.insert(0,t);
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if (Character.isLowerCase(c)){
                    int n = alphaLower.indexOf(Character.toString(c));
                    encrypt.append(alphaEncryptLower.charAt(n));
                }
                else{ // is uppercase
                    int n = alphaUpper.indexOf(Character.toString(c));
                    encrypt.append(alphaEncryptUpper.charAt(n));
                }
            }
            else{ //is not a letter
                encrypt.append(s.charAt(i));
            }
        }
        return encrypt.toString();
    }
}