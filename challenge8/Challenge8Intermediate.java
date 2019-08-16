/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/psewf/2162012_challenge_8_intermediate/
 * Created: 7/8/17
 * Modified: 7/8/17
 * Author: Ryan Lioy
 * Note: Number must be less than 10,000
 * Dumb but it works
 */
package Challenge8;
import java.util.Scanner;
public class Challenge8Intermediate {
    public static final String[] digits = {"zero","one","two","three","four","five","six",
                                           "seven","eight","nine"};
    public static final String[] tens = {null,"ten","twenty","thirty","fourty","fifty","sixy",
                                         "seventy","eighty","ninety"};
    public static final String[] mags = {"hundred","thousand"};
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        System.out.println(asString(scan.nextInt()));
    }
    public static String asString(int num){
        char[] array = Integer.toString(num).toCharArray(); //convert to char[]
        String result = "";
        if (array.length == 4){
            int n = Character.getNumericValue(array[0]);
            result += digits[n]+" "+mags[1]+" ";
            n = Character.getNumericValue(array[1]);
            result += digits[n]+" "+mags[0]+" ";
            n = Character.getNumericValue(array[2]);
            result += tens[n]+" ";
            n = Character.getNumericValue(array[3]);
            result += digits[n];
        }
        else if (array.length == 3){
            int n = Character.getNumericValue(array[0]);
            result += digits[n]+" "+mags[0]+" ";
            n = Character.getNumericValue(array[1]);
            result += tens[n]+" ";
            n = Character.getNumericValue(array[2]);
            result += digits[n];
        }
        else if (array.length == 2){
            int n = Character.getNumericValue(array[0]);
            result += tens[n]+" ";
            n = Character.getNumericValue(array[1]);
            result += digits[n];
        }
        else if (array.length == 1){
            int n = Character.getNumericValue(array[0]);
            result += digits[n];
        }
        return result;
    }
}