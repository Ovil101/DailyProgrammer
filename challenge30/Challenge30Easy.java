/**
 * @author Ryan Lioy
 * @version 8/10/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/reago/3262012_challenge_30_easy/
 */
package Challenge30;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge30Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        System.out.print("Enter integers(type \"end\" to end): ");
        while(true){
            String input = scan.next();
            if (input.equals("end")){
                break;
            }
            else{
                l.add(Integer.valueOf(input));
            }
        }
        System.out.print("Enter target: ");
        ArrayList<String> sl = intTest(l,scan.nextInt());
        for (String s : sl){
            System.out.println(s);
        }
    }
    public static ArrayList<String> intTest(ArrayList<Integer> list, int n){
        ArrayList<String> l = new ArrayList<>(0);
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (i != j){ //yes these if statements can be one
                    if (list.get(i)+list.get(j)==n){
                        l.add("Integers "+list.get(i)+" and "+list.get(j)+" equals "+n);
                    }
                }
            }
        }
        if (l.size() == 0){
            l.add("No integers add up to the target number.");
        }
        return l;
    }
}