/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pwons/2192012_challenge_11_easy/
 * Created: 7/15/17
 * Modified: 7/17/17
 * Author: Ryan Lioy
 * Note: Uses the Guass algorithm
 */
package Challenge11;
import java.util.Scanner;

public class Challenge11Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day(1-31):");
        int d = scan.nextInt();
        System.out.println("Enter a month(1-12):");
        int m = scan.nextInt();
        System.out.println("Enter a year:");
        int y = scan.nextInt();
        System.out.println(calculate(d,m,y));
    }
    public static String calculate(int day, int month, int year){
        int d, y, Y, c, m, w;
        if (month == 0 || month == 1){
            Y = year-1; //if jan or feb, substract 1
        }
        else{
            Y = year; //else, it is jus the rear
        }
        d = day;
        m = ((month+9)%12)+1;
        y = Y%100;
        c = Y/100;
        w = (int)(d+Math.floor(2.6*m-0.2)+y+Math.floor(y/4)+Math.floor(c/4)-2*c);
        w %= 7;
        return findDay(w);
    }
    public static String findDay(int day){
        String s = "";
        if (day == 0){
            return "Sunday";
        }
        else if (day == 1){
            return "Monday";
        }
        else if (day == 2){
            return "Tuesday";
        }
        else if (day == 3){
            return "Wednesday";
        }
        else if (day == 4){
            return "Thursday";
        }
        else if (day == 5){
            return "Friday";
        }
        else if (day == 6){
            return "Saturday";
        }
        return "-1";
    }
}