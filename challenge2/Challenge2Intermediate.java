/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pjsdx/difficult_challenge_2/
 * Created: 7/2/17
 * Modified: 7/3/17 | fixed main method
 * Author: Ryan Lioy
 */
package Challenge2;
import java.util.Scanner;
public class Challenge2Intermediate {
    static String[] args = {};
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("You awaken to find yourself\n"
                + "laying in a forest. The ground is\n"
                + "slightly damp and holds the smell of\n"
                + "petrichor. A light breeze is rustling\n"
                + "the leaves. You hear the sound of rushing\n"
                + "water to the left. A cliff face lies in front\n"
                + "of an behind you, to your right the forest continues\n");
        System.out.println("What do you do?\n"
                + "R - Continue on to the forest\n"
                + "L - Walk towards the water");
        String choice = scan.next().toLowerCase();
        switch (choice){
            case "r":
                forest();
                break;
            case "l":
                water();
                break;
            default:
                System.out.println("Please enter vaild choice");
                main(args);
                break;
        }
    }
    public static void dead(){
        System.out.println("You have died");
    }
    public static void forest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have walked deeper into the forest\n"
                + "Good job, you are lost.\n"
                + "Idiot");
    }
    public static void water(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You approach the water and find\n"
                + "a raging river flowing southwest. The forest continues\n"
                + "on the other side of the river, however the current is\n"
                + "strong. What do you do?");
        System.out.println("F - Swim across the river\n"
                + "B - Return the forest");
        String choice = scan.next().toLowerCase();
        switch (choice){
            case "f":
                dead();
                break;
            case "b":
                main(args);
                break;
            default:
                System.out.println("Enter vaild choice");
                water();
        }
    }
    public static void acrossRiver(){
        dead();
    }
}