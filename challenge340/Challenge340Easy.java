/**
 * @author Ryan Lioy
 * @version 12/31/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/7cnqtw/20171113_challenge_340_easy_first_recurring/
 */
package Challenge340;
import java.util.Scanner;
public class Challenge340Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to parse: ");
        String s = scan.nextLine();
        System.out.println(firstRecurringChar(s));
        System.out.println(firstRecurringCharIndex(s));
    }
    public static char firstRecurringChar(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){ //nested for loops for checking char against other chars in string
                char c = s.charAt(i);
                if (i!=j && s.charAt(j)==c){
                    count++;
                }
                if (count==1 && s.charAt(j)==c){
                    return s.charAt(j);
                }
            }
        }
        return '_'; //because compiler wants a return statement
    }
    public static int firstRecurringCharIndex(String s){ //same thing as above, but returns the index
        int count = 1;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){
                char c = s.charAt(i);
                if (i!=j && s.charAt(j)==c){
                    count++;
                }
                if (count==2 && s.charAt(j)==c){
                    return j; //only difference
                }
            }
        }
        return -1; //this is also a difference
    }
}