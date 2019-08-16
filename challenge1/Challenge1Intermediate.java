/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pihtx/intermediate_challenge_1/
 * Created: 7/1/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package challenge1;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge1Intermediate {
    static String[] args = {};
    static ArrayList<String> schedule = new ArrayList<String>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        print();
        System.out.println("Type 'edit' to edit\nType 'add' to add\nType 'remove' to remove");
        String option = scan.next();
        Scanner sc = new Scanner(System.in);
        switch (option){
            case "edit":
                System.out.println("Enter name of event to edit:");
                String name = sc.next();
                edit(name);
                break;
            case "add":
                System.out.println("Enter name of new event:");
                String n = sc.next();
                System.out.println("Enter time (X:XX) of new event:");
                String t = sc.next();
                add(t,n);
                break;
            case "remove":
                System.out.println("Enter name of event to remove:");
                String na = sc.next();
                remove(na);
                break;
            default:
                System.out.println("Enter valid option");
                main(args);
                break;
        }
    }
    public static void add(String time, String name){
        schedule.add(name);
        schedule.add(time);
        main(args);
    }
    public static void remove(String name){
        int index = schedule.indexOf(name);
        schedule.remove(index);
        schedule.remove(index);
        main(args);
    }
    public static void edit(String name){
        int index = schedule.indexOf(name);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new name:");
        String n = scan.next();
        System.out.println("Enter new time:");
        String t = scan.next();
        schedule.remove(index);
        schedule.remove(index);
        schedule.add(index,t);
        schedule.add(index,n);
        main(args);
    }
    public static void print(){
        for (int i = 0; i < schedule.size(); i+=2){
            System.out.println("Event: "+schedule.get(i)+"\n"+"Time: "+schedule.get(i+1));
        }
        System.out.println("---------------");
    }
}