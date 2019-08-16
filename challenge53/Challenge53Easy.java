/**
 * @author Ryan Lioy
 * @version 9/16/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/tpxq9/5162012_challenge_53_easy/
 */
//I have no idea how much time this takes, but it should be fast.
package Challenge53;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Challenge53Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numbers for first array (0 to exit): ");
        ArrayList<Integer> a = new ArrayList<>();
        while (true){
            int i = scan.nextInt();
            if (i == 0){
                break;
            }
            else{
                a.add(i);
            }
        }
        System.out.print("Enter numbers for second array (0 to exit): ");
        ArrayList<Integer> b = new ArrayList<>(0);
        while (true){
            int i = scan.nextInt();
            if (i == 0){
                break;
            }
            else{
                b.add(i);
            }
        }
        int[] c = combine(toArray(a), toArray(b));
        Arrays.sort(c);
        for (int i : c){
            System.out.println(i);
        }
    }
    public static int[] combine(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        return c;
    }
    public static int[] toArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}