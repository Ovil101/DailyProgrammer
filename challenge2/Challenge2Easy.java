/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pjbj8/easy_challenge_2/
 * Created: 7/2/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package Challenge2;
import java.util.Scanner;

public class Challenge2Easy {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("What do you want to solve for (F/A/M)?");
        String choice  = scan.next().toLowerCase();
        switch (choice){
            case "f":
                System.out.println(solveF());
                break;
            case "a":
                System.out.println(solveA());
                break;
            case "m":
                System.out.println(solveM());
                break;
        }
    }
    public static int solveF(){
        System.out.println("Enter m value:");
        int m = scan.nextInt();
        System.out.println("Enter a value:");
        int a = scan.nextInt();
        return a*m;
    }
    public static double solveA(){
        int f = scan.nextInt();
        System.out.println("Enter f value:");
        int m = scan.nextInt();
        System.out.println("Enter m value:");
        return f/m;
    }
    public static double solveM(){
        int f = scan.nextInt();
        System.out.println("Enter f value:");
        int a = scan.nextInt();
        System.out.println("Enter a value:");
        return f/a;
    }
}