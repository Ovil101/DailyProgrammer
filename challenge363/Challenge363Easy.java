/**
 * @author Ryan Lioy
 * @version 6/18/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/8q96da/20180611_challenge_363_easy_i_before_e_except/
 */
package challenge363;

import java.util.Scanner;

public class Challenge363Easy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String s = scan.nextLine();
            if (!s.equals("end")) {
                System.out.println(iBeforeE(s));
            } else {
                break;
            }
        }
    }

    public static boolean iBeforeE(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.equals("ei") && s.charAt(i - 1) != 'c') {
                return false;
            } else if (sub.equals("ie") && s.charAt(i - 1) == 'c') {
                return false;
            }
        }
        return true;
    }
}
