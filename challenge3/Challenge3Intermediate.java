/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pkwb1/2112012_challenge_3_intermediate/
 * Created: 7/3/17
 * Modified: 713/17
 * Author: Ryan Lioy
 * Note: only works with letters, not other chars
 */
package Challenge3;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Challenge3Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter phrase to encrypt:");
        String phrase = scan.nextLine().toUpperCase();
        System.out.println(encrypt(remove(phrase),phrase));
    }
    public static String encrypt(String key, String toEncrypt){
        StringBuilder result = new StringBuilder();
        String top = key.substring(0,key.length()/2); //first half
        String bot = key.substring(key.length()/2); //second half
        char[] asArray = toEncrypt.toCharArray();
        for (int i = 0; i < toEncrypt.length(); i++){
            int indexT = top.indexOf(asArray[i]);
            int indexB = bot.indexOf(asArray[i]);
            if (indexT >= -1){ //must be in top
                result.append(bot.charAt(indexT)); 
                //StringIndexOutOfBoundsException above (27) when
                //string contains chars other than letter, ie spaces
            }
            else if (indexB >= -1){ //must be in bot
                result.append(top.charAt(indexB));
            }
            else{ //is not a letter
                result.append(key.charAt(i));
            }
        }
        return result.toString();
    }
    public static String remove(String key){ //places letters of key in beginning of alpha
        StringBuilder alpha = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        char[] asChar = key.toCharArray(); //key as char[]
        for (int i = key.length()-1; i >= 0; i--){ //for char in key
            try{
                char c = asChar[i]; //gets a letter in the key
                int index = alpha.indexOf(Character.toString(c).toUpperCase()); //index of 
                alpha.insert(0, c); //place c in first index
                alpha.deleteCharAt(index+1); //delete character
            }
            catch(StringIndexOutOfBoundsException e){ 
                continue; //basically ignore the exception
            }
        }
        return alpha.toString();
    }
}