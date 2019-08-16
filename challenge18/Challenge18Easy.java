/**
 * @Link: https://www.reddit.com/r/dailyprogrammer/comments/qit0h/352012_challenge_18_easy/
 * @Created: 7/24/17
 * @Modified: 7/24/17
 * @Author: Ryan Lioy
 */
package Challenge18;
import java.util.Scanner;
public class Challenge18Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter last 7 digits: ");
        String i = scan.nextLine().toUpperCase();
        System.out.println(toAlpha(i));
    }
    public static String toAlpha(String number){
        String[][] keyPad = {{"2","ABC"},
                             {"3","DEF"},
                             {"4","GHI"},
                             {"5","JKL"},
                             {"6","MNO"},
                             {"7","PQRS"},
                             {"8","TUV"},
                             {"9","WXYZ"}};
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            for (int j = 0; j < keyPad.length; j++){
                if (keyPad[j][1].contains(Character.toString(c))){
                    build.append(keyPad[j][0]);
                }
            }
        }
        return asPhoneNumber(build.toString());
    }
    public static String asPhoneNumber(String number){ //1-800-XXX-XXXX format
        return "1-800-"+number.substring(0,3)+"-"+number.substring(3);
    }
}