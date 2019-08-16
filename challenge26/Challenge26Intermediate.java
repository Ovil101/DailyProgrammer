/**
 * @author Ryan Lioy
 * @version 8/5/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/qzip3/3162012_challenge_26_intermediate/
 */
package Challenge26;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge26Intermediate {
    static ArrayList<String> list = new ArrayList<>();
    static String[] args = {};
    public static void main(String[] args){
        System.out.println("----------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Print - display current information");
        System.out.println("Add - add entry");
        System.out.println("Remove - remove entry");
        System.out.println("Edit - edit an item");
        System.out.println("Exit - close program");
        System.out.print("Enter choice: ");
        boolean exit = false;
        while (!exit){
            switch (scan.next().toLowerCase()){
                case "print":
                    print();
                    main(args);
                case "add":
                    add();
                    main(args);
                case "remove":
                    remove();
                    main(args);
                case "edit":
                    edit();
                    main(args);
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Enter valid option");
            }
        }
    }
    public static void add(){
        System.out.println("----------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        list.add(scan.nextLine());
        System.out.print("Enter age: ");
        list.add(scan.nextLine());
        System.out.print("Enter pay: ");
        list.add(scan.nextLine());
    }
    public static void remove(){
        System.out.println("----------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of entry to remove: ");
        int index = list.indexOf(scan.nextLine());
        if (index == -1){
            System.out.println("Entry does not exist");
            main(args);
        }
        else{
            for (int i = index; i < index+3; i++){
                list.remove(i);
            }
        }
    }
    public static void print(){
        System.out.println("----------------");
        System.out.println("NAME/AGE/WAGE");
        for (int i = 0; i < list.size(); i+=3){
            for (int j = i; j < i+3; j++){
                System.out.print(list.get(j)+"\t");
            }
            System.out.println();
        }
    }
    public static void edit(){
        System.out.println("----------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item to edit: ");
        int index = list.indexOf(scan.nextLine());
        System.out.print("Enter new value; ");
        list.set(index, scan.nextLine());
    }
}