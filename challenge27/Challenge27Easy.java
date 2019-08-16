/**
 * @author Ryan Lioy
 * @version 8/6/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/r0r3h/3172012_challenge_27_easy/
 */
package Challenge27;
import java.util.Scanner;
public class Challenge27Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        String[] s = leapYear(scan.nextInt());
        if (s[0].equals("true")){ //is leap year
            System.out.println("Century: "+s[1]);
            System.out.println("Leap Year: Yes");
        }
        else{ //not leap year
            System.out.println("Century: "+s[1]);
            System.out.println("Leap Year: No");
        }
    }
    public static String[] leapYear(int year){
        String[] result = new String[2];
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    result[0] = "true";
                }
                else{
                    result[0] = "false";
                }
            }
            else{
                result[0] = "false";
            }
        }
        else{
            result[0] = "false";
        }
        result[1] = Integer.toString((int)Math.ceil((double)year/100));
        return result;
    }
}
