/**
 * Does not work for the years xx002-xx12. ¯\_(ツ)_/¯
 * @author Ryan Lioy
 * @version 8/6/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/r0r46/3172012_challenge_27_intermediate/
 */
package Challenge27;
import java.util.Scanner;
public class Challenge27Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        System.out.println("St. Patrick's Day is on a "+calculate(scan.nextInt()));
    }
    public static String calculate(int year){
        int month = 3;
        int d, y, Y, c, m, w;
        if (month == 0 || month == 1){
            Y = year-1; //if jan or feb, substract 1
        }
        else{
            Y = year; //else, it is just the rear
        }
        d = 17;
        m = ((month+9)%12)+1;
        y = Y%100;
        c = Y/100;
        w = (int)(d+Math.floor(2.6*m-0.2)+y+Math.floor(y/4)+Math.floor(c/4)-2*c);
        w %= 7;
        return findDay(w);
    }
    public static String findDay(int day){
        System.out.println(day);
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
        return null;
    }
}