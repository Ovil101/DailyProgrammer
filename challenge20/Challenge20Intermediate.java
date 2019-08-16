/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/qnkpp/382012_challenge_20_intermediate/
 * Created: 7/24/17
 * Modified: 7/24/17
 * Author: Ryan Lioy
 */
package Challenge20;
import java.util.Scanner;
public class Challenge20Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan.nextInt();
        System.out.println("Months: "+age*12+"\n"+"Days: "+age*365+"\n"+"Hours: "+age*8766+"\n"+"Minutes: "+age*525949);
    }
}