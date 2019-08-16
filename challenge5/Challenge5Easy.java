/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pm6oj/2122012_challenge_4_easy/
 * Created: 7/3/17
 * Modified: 7/3/17
 * Author: Ryan Lioy
 */
package Challenge5;
import java.util.Scanner;
public class Challenge5Easy {
    static private String password = "password";
    static private String username = "user";
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String user = scan.next();
        System.out.println("Enter password:");
        String pass = scan.next();
        if (password.equals(pass) && username.equals(user)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Wrong password or username");
            main(args);
        }
    }
}