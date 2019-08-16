/**
 * @author Ryan Lioy
 * @version 11/4/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/52enht/20160912_challenge_283_easy_anagram_detector/
 */
package Challenge283;
import java.util.Arrays;
import java.util.Scanner;
public class Challenge283Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter input: ");
        String s = scan.nextLine();
        System.out.println(isAnagram(s));
    }
    public static String isAnagram(String words){
        String original1 = words.substring(1,indexOf('\"',words,2)).toLowerCase();
        String original2 = words.substring(indexOf('\"',words,3)+1,words.length()-1).toLowerCase();
        char[] phrase1 = original1.toCharArray();
        char[] phrase2 = original2.toCharArray();
        Arrays.sort(phrase1);
        Arrays.sort(phrase2);
        String p1 = removeNonLetters(phrase1);
        String p2 = removeNonLetters(phrase2);
        if (p1.equals(p2)){
            return "\""+original1+"\""+" is an anagram of \""+original2+"\"";
        }
        else{
            return "\""+original1+"\""+" is NOT an anagram of \""+original2+"\"";
        }
    }
    public static int indexOf(char c, String s, int n){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==c){
                count++;
            }
            if (n==count){
                return i;
            }
        }
        return -1;
    }
    public static String removeNonLetters(char[] array){
        StringBuilder build = new StringBuilder();
        for (char c : array){
            if (Character.isLetter(c)){
                build.append(c);
            }
        }
        return build.toString();
    }
    public static String toString(char[] array){
        StringBuilder build = new StringBuilder();
        for (char c : array){
            build.append(c);
        }
        return build.toString();
    }
}