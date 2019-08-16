/**
 * @Link: https://www.reddit.com/r/dailyprogrammer/comments/pxs2x/2202012_challenge_12_easy/
 * @Created: 7/18/17
 * @Modified: 7/21/17
 * @Author: Ryan Lioy
 */
package Challenge12;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
public class Challenge12Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        System.out.println(permutate(s));
    }
    public static ArrayList<String> permutate(String s){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder build = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++){
            build = new StringBuilder(s); //reset build
            for (int j = 0; j < s.length(); j++){
                char c = build.charAt(i);
                build.deleteCharAt(i);
                build.insert(j, c);
                list.add(build.toString());
            }
        }
        list = new ArrayList<String>(new LinkedHashSet<String>(list)); //remove duplicates
        return list;
    }
}