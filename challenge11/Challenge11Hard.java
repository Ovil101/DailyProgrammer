/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pwpdz/2192012_challenge_11_difficult/
 * Created: 7/18/17
 * Modified: 7/27/17
 * Author: Ryan Lioy
 */
package Challenge11;
import java.util.Scanner;
public class Challenge11Hard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int m = scan.nextInt();
        System.out.print("Enter the year: ");
        int y = scan.nextInt();
        int firstDay = calculate(m,y);
        printCalendar(firstDay,m);
    }
    public static int calculate(int month, int year){ //the first day of the month
        int d, y, Y, c, m, w;
        if (month == 0 || month == 1){
            Y = year-1; //if jan or feb, substract 1
        }
        else{
            Y = year; //else, it is just the rear
        }
        d = 1;
        m = ((month+9)%12)+1;
        y = Y%100;
        c = Y/100;
        w = (int)(d+Math.floor(2.6*m-0.2)+y+Math.floor(y/4)+Math.floor(c/4)-2*c);
        w %= 7;
        return findDay(w);
    }
    public static int findDay(int day){
        if (day == 0){
            return 1;
        }
        else if (day == 1){
            return 2;
        }
        else if (day == 2){
            return 3;
        }
        else if (day == 3){
            return 4;
        }
        else if (day == 4){
            return 5;
        }
        else if (day == 5){
            return 6;
        }
        else if (day == 6){
            return 7;
        }
        return -1;
    }
    public static void printCalendar(int firstDay, int month){
        int[] days = {29,31,28,31,30,31,30,31,31,30,31,30,31};
        int day = firstDay;
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        if (firstDay != 1){
            for (int j = 1; j <= firstDay; j++){
                System.out.print("    ");
            }
            System.out.print("  ");
        }
        for (int i = 1; i <= days[month]; i++){
            if (day == 8){
                System.out.println();
                day = 1;
            }
            System.out.printf("%2d"+"    ",i);
            day++;
        }
        System.out.println();
    }
}