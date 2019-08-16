/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pv98f/2182012_challenge_10_easy/
 * Created: 7/15/17
 * Modified: 7/15/17
 * Author: Ryan Lioy
 */
package Challenge10;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Challenge10Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(isValid(scan.next()));
        
    }
    public static boolean isValid(String number){
        String pattern = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$"; //Thanks Internet!
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(number);
        return matcher.matches();
    }
}
