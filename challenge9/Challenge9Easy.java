/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pu1rf/2172012_challenge_9_easy/
 * Created: 7/13/17
 * Modified: 7/15/17
 * Author: Ryan Lioy
 * Note: Only works with integers
 */
package Challenge9;
import java.util.Scanner;
import java.util.ArrayList;


public class Challenge9Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers, type 'end' to end:");
        while (true){
            String s = scan.next();
            if (s.equals("end")){
                break;
            }
            else{
                list.add(Integer.valueOf(s));
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){ //convert list to array
            array[i] = list.get(i);
        }
        for (int i = 1; i < array.length; i++){ //sort
            int key = array[i];
            int j = i-1;
            while (j >= 0 && key < array[j]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}