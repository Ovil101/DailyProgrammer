/**
 * @author Ryan Lioy
 * @version 8/20/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rhs8i/3282012_challenge_32_intermediate/
 */
package Challenge32;
import java.util.Scanner;
public class Challenge32Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int disks = scan.nextInt();
        hanoi(disks,"Source","Destination","Spare");
    }
    public static void hanoi(int disks, String s, String d, String sp){
        if (disks > 0){
            hanoi(disks-1, s,sp,d);
            System.out.println("Move from "+s+" to "+d);
            hanoi(disks-1,sp,d,s);
        }
    }
}