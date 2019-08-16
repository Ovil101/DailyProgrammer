/**
 * @author Ryan Lioy
 * @version 1/24/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/3kx6oh/20150914_challenge_232_easy_palindromes/
 */
package Challenge232;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;
public class Challenge232Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lines: ");
        int i = scan.nextInt();
        String s = "";
        for (int j = 1; j <= i+1; j++){ //have to input line by line
            s+=scan.nextLine(); //string concatenation in loop fight me
        }
        if (isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean isPalindrome(String s){
        StringBuilder a = new StringBuilder(removeNonLetters(s.toLowerCase()));
        StringBuilder b = new StringBuilder(removeNonLetters(s.toLowerCase())).reverse();
        return a.toString().equals(b.toString()); //intellij gets mad when comparing two stringbuilders.
    }
    public static StringBuilder removeNonLetters(String s){
        final char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                                 't','u','v','w','x','y','z'};
        StringBuilder build = new StringBuilder(s.toLowerCase());
        for (int i = 0; i < build.length(); i++){
            char c = build.charAt(i);
            if (!ArrayUtils.contains(alphabet,c)){
                build.deleteCharAt(i);
                i--;
            }
        }
        return build;
    }
}