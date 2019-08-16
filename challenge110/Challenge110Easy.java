/**
 * @author Ryan Lioy
 * @version 1/13/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/12k3xr/1132012_challenge_110_easy_keyboard_shift/
 */
package Challenge110;
import java.util.Scanner;
public class Challenge110Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(shift(scan.nextLine()));
    }
    public static StringBuilder shift(String text){
        StringBuilder build = new StringBuilder();
        final String shift = "wertyuiop[sdfghjkl;xcvbnm,WERTYUIOP[SDFGHJKL;XCVBNM,";
        final String real = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        for (int i = 0; i < text.length(); i++){
            int shiftIndex =  shift.indexOf(text.charAt(i));
            if (shiftIndex!=-1){
                build.append(real.charAt(shiftIndex));
            }
            else{ //if char is not found in shift, just copy over char from text
                build.append(text.charAt(i));
            }
        }
        return build;
    }
}