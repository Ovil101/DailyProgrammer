/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/quli5/3132012_challenge_23_easy/
 * Created: 7/25/17
 * Modified: 7/25/17
 * Author: Ryan Lioy
 */
package Challenge23;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge23Easy {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(6);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter six values: ");
        for (int i = 1; i <= 7; i++){
            list.add(scan.nextLine());
        }
        System.out.println(split(list));
    }
    public static ArrayList<ArrayList> split(ArrayList<String> list){
        ArrayList<ArrayList> halves = new ArrayList<>();
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        //the first half
        for (int i = 0; i < list.size()/2; i++){
            first.add(list.get(i));
        }
        for (int i = list.size()/2; i < list.size(); i++){
            second.add(list.get(i));
        }
        halves.add(first);
        halves.add(second);
        return halves;
    }
}