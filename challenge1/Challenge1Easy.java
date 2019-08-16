/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pih8x/easy_challenge_1/
 * Created: 7/1/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package Challenge1;
import java.util.Scanner;
public class Challenge1Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your reddit username:");
        String user = scan.next();
        System.out.println("Your name is "+name+", you are "
                +age+" years old, and your username is "+user);
    }
}