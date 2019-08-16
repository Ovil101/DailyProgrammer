/**
 * @author Ryan Lioy
 * @version 9/5/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/tmnfq/5142012_challenge_52_easy/
 */
package Challenge52;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Challenge52Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 words: ");
        String[] array = new String[2]; //limited to 2 words because ¯\_(ツ)_/¯
        for (int i = 0; i < 2; i++){
            array[i] = scan.nextLine();
        }
        System.out.println(sumOrder(array));
    }
    public static String sumOrder(String[] words){
        StringBuilder build = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        final char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                 'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (String s : words){
            int sum = 0;
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                for (int j = 0; j < alphabet.length; j++){
                    if (alphabet[j] == c){
                        sum+=j+1;
                    }
                }
            }
            list.add(sum);
        }
        int[] array = toIntArray(list);
        Arrays.sort(array);
        array  = reverse(array);
        for (int i = 0; i < list.size(); i++){
             build.append(array[i]+", ");
        }
        build.delete(build.length()-2, build.length()); //delete extra , and space.
        return build.toString();
    }
    public static int[] toIntArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static int[] reverse(int[] array){ //why does Arrays not have this?
        int[] arr = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i >= 0; i--){
            arr[i] = array[index];
            index++;
        }
        return arr;
    }
}