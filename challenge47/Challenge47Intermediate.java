/**
 * @author Ryan Lioy
 * @version 9/1/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/t33vn/522012_challenge_47_intermediate/
 */
package Challenge47;
import java.util.Scanner;
public class Challenge47Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a single digit number: ");
        int i = englishToDec(scan.nextLine().toLowerCase());
        if (i == -1){
            System.out.println("Invalid number");
        }
        else{
            System.out.println("Your number was: "+i);
        }
    }
    public static int englishToDec(String s){
        int i = 0;
        String str = s.substring(0,2);
        if (str.equals("ze")) return 0;
        else if (str.equals("on")) return 1;
        else if (str.equals("tw")) return 2;
        else if (str.equals("th")) return 3;
        else if (str.equals("fo")) return 4;
        else if (str.equals("fi")) return 5;
        else if (str.equals("si")) return 6;
        else if (str.equals("se")) return 7;
        else if (str.equals("ei")) return 8;
        else if (str.equals("ni")) return 9;
        return -1;
    }
}