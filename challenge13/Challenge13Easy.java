/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pzo4w/2212012_challenge_13_easy/
 * Created: 7/21/17
 * Modified: 7/21/17
 * Author: Ryan Lioy
 */
package Challenge13;
import java.util.Scanner;
public class Challenge13Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int m = scan.nextInt();
        System.out.print("Enter the day: ");
        int d = scan.nextInt();
        System.out.println("Is this a leap year(y/n): ");
        String s = scan.next().toLowerCase();
        if (s.equals("y")){
            System.out.println(findDay(d,m,true));
        }
        else{
            System.out.println(findDay(d,m,false));
        }
    }
    public static int findDay(int day, int month, boolean leap){
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        if (leap){
            for (int i = 0; i < month; i++){
                days += months[i];
            }
            days += day+1;
        }
        else{
            for (int i = 0; i < month; i++){
                days += months[i];
            }
            days += day;
        }
        return days;
    }
}