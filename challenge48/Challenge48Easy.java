/**
 * @author Ryan Lioy
 * @version 9/2/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/t78m8/542012_challenge_48_easy/
 */
//this does not follow the linear time requirement of the challenge.
package Challenge48;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge48Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        System.out.print("Enter an integer (0 to exit): ");
        while (true){
            i = scan.nextInt();
            if (i == 0){
                break;
            }
            else{
                list.add(i);
            }
        }
        int[] arr = toArray(list);
        arr = sort(arr);
        for (int k : arr){
            System.out.println(k);
        }
    }
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i] % 2 == 0 && array[j]%2 == 1) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int[] toArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}