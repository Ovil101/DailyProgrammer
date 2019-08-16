/**
 * @author Ryan Lioy
 * @version 8/24/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rmmqx/3312012_challenge_34_intermediate/
 */
package Challenge34;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge34Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter integers(-1 to quit): ");
        while (true){
            int i = scan.nextInt();
            if (i == -1){
                break;
            }
            else{
                list.add(i);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        System.out.print("Bogo or Stooge? ");
        String a = scan.next();
        if (a.toLowerCase().equals("bogo")){
            array = bogo(array);
        }
        else if (a.toLowerCase().equals("stooge")){
            array = stooge(array,0,array.length-1);
        }
        else{
            System.out.println("Enter valid choice.");
        }
        for (int i : array){
            System.out.println(i);
        }
    }
    public static int[] bogo(int[] array){
        Random r = new Random();
        boolean notSorted = true;
        int iterations = 0;
        while(notSorted){
            int[] t = array;
            iterations++;
            for (int i = 0; i < t.length; i++){
                int random = r.nextInt(array.length);
                int temp = t[i];
                t[i] = t[random];
                t[random] = temp;
            }
            if (isSorted(t)){
                notSorted = false;
            }
        }
        System.out.println("ITERATIONS: "+iterations);
        return array;
    }
    public static boolean isSorted(int[] t){
        for (int i = 0; i < t.length-1; i++){
            if (t[i] > t[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int[] stooge(int[] array, int left, int right){
        if(array[left] > array[right]){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        if((right-left) >= 3){
            int length = (int)Math.floor((right-left+1)/3);
            stooge(array, left, right-length);
            stooge(array, left+length, right);
            stooge(array, left, right-length);
        }
        return array;
    }
}