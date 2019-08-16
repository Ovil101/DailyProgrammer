/**
 * @author Ryan Lioy
 * @version 8/4/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/qzil1/3162012_challenge_26_easy/
 */
package Challenge26;
import java.util.Scanner;
public class Challenge26Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String[] a = removeDuplicates(scan.nextLine());
        for (String s : a){
            System.out.println(s);
        }
    }
    public static String[] removeDuplicates(String s){
        String[] array = new String[2];
        StringBuilder build = new StringBuilder(s);
        String removed = "";
        for (int i = 0; i < build.length(); i++){
            if ((i!= build.length()-1)&&build.charAt(i+1)==build.charAt(i)){
                removed += build.charAt(i+1);
                build.deleteCharAt(i+1);
                i--;
            }
        }
        array[0] = build.toString();
        array[1] = removed;
        return array;
    }
}