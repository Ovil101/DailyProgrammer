/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/qp3ub/392012_challenge_21_easy/
 * Created: 7/25/17
 * Modified: 7/25/17
 * Author: Ryan Lioy
 * Note: Can return repeats.
 */
package Challenge21;
import java.util.Scanner;
import java.util.Random;
public class Challenge21Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(rearrange(scan.nextLine()));
    }
    public static String rearrange(String num){
        StringBuilder build = new StringBuilder(num);
        Random r = new Random(); //for switching places
        for (int i = 0; i < build.length(); i++){
            int a = r.nextInt(build.length());
            char temp = build.charAt(a);
            build.setCharAt(a, build.charAt(i));
            build.setCharAt(i, temp);
        }
        return build.toString();
    }
}