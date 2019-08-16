/**
 * @author Ryan Lioy
 * @version 8/7/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/r59kk/3202012_challenge_28_easy/
 */
package Challenge28;
import java.util.Random;
import java.util.Scanner;
public class Challenge28Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = assign();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i!=j&&array[i] == array[j]){
                    System.out.println("Integer "+array[i]+" at indexes "+j+" and "+i+" is a duplicate.");
                }
            }
        }
        //for verifying
        for (int i = 0; i < array.length; i++){
            System.out.println("INDEX: "+i+" INTEGER: "+array[i]);
        }
    }
    public static int[] assign(){ //From Challenge14Hard
        int[] array = new int[50_000];
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            int n = r.nextInt(1_000_000)+1;
            array[i] = n;
        }
        return array;
    }
}