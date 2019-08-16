/**
 * @author Ryan Lioy
 * @version 2/4/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/79npf9/20171030_challenge_338_easy_what_day_was_it_again/
 */
package Challenge338;
import java.util.Scanner;
public class Challange338Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        double y = Integer.parseInt(s.substring(0,indexOf(' ',s,1)));
        double m = Integer.parseInt(s.substring(indexOf(' ',s,1)+1,indexOf(' ',s,2)));
        double d = Integer.parseInt(s.substring(indexOf(' ',s,2)+1));
        System.out.println(dayName(y,m,d));
    }
    public static String dayName(double year, double m, double q){
        if (m==1||m==2){
            m+=12;
            year-=1;
        }
        int h = (int)(q+Math.floor(13*(m+1)/5)+year+Math.floor(year/4)-Math.floor(year/100)+Math.floor(year/400))%7;
        switch (h){
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
        }
        return null;
    }
    public static int indexOf(char c, String s, int n){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==c){
                count++;
            }
            if (n==count){
                return i;
            }
        }
        return -1;
    }
}