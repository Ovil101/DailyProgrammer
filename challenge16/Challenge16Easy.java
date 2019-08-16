/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/q8aom/2272012_challenge_16_easy/
 * Created: 7/23/17
 * Modified: 7/23/17
 * Author: Ryan Lioy
 */
package Challenge16;
import java.util.Scanner;
public class Challenge16Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String of characters to remove: ");
        String remove = scan.nextLine();
        System.out.println();
        System.out.print("Enter String to edit: ");
        String edit = scan.nextLine();
        System.out.println(editString(edit,remove));
    }
    public static String editString(String toEdit, String toRemove){
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < toEdit.length(); i++){
            for (int j = 0; j < toRemove.length(); j++){
                if (toEdit.charAt(i) == toRemove.charAt(j)){
                    break;
                }
                else if(j==toRemove.length()-1){
                    build.append(toEdit.charAt(i));
                }
            }
        }
        return build.toString();
    }
}