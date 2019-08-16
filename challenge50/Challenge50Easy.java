/**
 * @author Ryan Lioy
 * @version 9/2/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/teua8/592012_challenge_50_easy/
 */
package Challenge50;
import java.util.ArrayList;
import java.util.Scanner;
public class Challenge50Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        System.out.print("Enter item price (as int, 0 to continue): ");
        while (true){
            i = scan.nextInt();
            if (i == 0){
                break;
            }
            else{
                list.add(i);
            }
        }
        System.out.print("Enter limit: ");
        storeCredit(toArray(list), scan.nextInt());
    }
    public static void storeCredit(int[] list, int max){
        for (int i = 0; i < list.length; i++){
            for (int j = i+1; j < list.length; j++){
                if (list[i]+list[j]==max){
                    System.out.println(i+1+","+(j+1));
                    break;
                }
            }
        }
        System.out.println("No solution.");
    }
    public static int[] toArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}