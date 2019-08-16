/**
 * @author Ryan Lioy
 * @version 8/10/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/r8a70/3222012_challenge_29_easy/
 */
package Challenge29;
import java.util.Scanner;
public class Challenge29Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String to test: ");
        System.out.println(stringPalindrome2(scan.nextLine()));
    }
    public static boolean stringPalindrome(String s){ //the simple way
        StringBuilder build = new StringBuilder(s);
        if (build.reverse().equals(build)){
            return true;
        }
        return false;
    }
    public static boolean stringPalindrome2(String s){ //more hands on
        StringBuilder build = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            build.append(s.charAt(i));
        }
        if (build.toString().equals(s)){
            return true;
        }
        return false;
    }
}