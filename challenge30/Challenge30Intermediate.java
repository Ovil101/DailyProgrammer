/**
 * @author Ryan Lioy
 * @version 8/12/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/red6f/3262012_challenge_30_intermediate/
 */
package Challenge30;
import java.util.Scanner;
public class Challenge30Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to verify: ");
        long a = scan.nextLong();
        System.out.print("Enter number to calculte check digit: ");
        long b = scan.nextLong();
        System.out.println("VERIFY: "+verify(a));
        System.out.println("CHECK: "+addCheckDigit(b));
    }
    public static boolean verify(long l){
        String s = Long.toString(l);
        int s1 = 0, s2 = 0;
        for (int i = s.length()-1; i >= 0 ; i--){
            if (i % 2 == 0){
                s1 += Character.getNumericValue(s.charAt(i));
            }
            else{
                s2 += 2*Character.getNumericValue(s.charAt(i));
                if (Character.getNumericValue(s.charAt(i)) >= 5){
                    s2 -= 9;
                }
            }
        }
        if ((s1+s2) % 10 == 0){
            return true;
        }
        return false;
    }
    public static long addCheckDigit(long l){
        StringBuilder s = new StringBuilder(Long.toString(l));
        int s1 = 0, s2 = 0;
        for (int i = s.length()-1; i >= 0 ; i--){
            if (i % 2 == 0){
                s1 += Character.getNumericValue(s.charAt(i));
            }
            else{
                s2 += 2*Character.getNumericValue(s.charAt(i));
                if (Character.getNumericValue(s.charAt(i)) >= 5){
                    s2 -= 9;
                }
            }
        }
        return Long.valueOf(s.append((9*(s1+s2))%10).toString());
    }
}