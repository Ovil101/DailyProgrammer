/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pniaw/2132012_challenge_5_difficult/
 * Created: 7/5/17
 * Modified: 7/5/17
 * Author: Ryan Lioy
 */
package Challenge5;
import java.util.Scanner;
public class Challenge5Hard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int playerHealth = 100;
        int monsterHealth = 200;
        System.out.println("An enemy ship has fired upon us! We must destroy them!");
        while (!(playerHealth >= 0) || !(monsterHealth <= 0)){
            System.out.println("Enemy health: "+monsterHealth);
            System.out.println("1 - Fire main cannon");
            System.out.println("2 - Fire secondary cannon");
            System.out.println("3 - Run");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    monsterHealth -= 30;
                    break;
                case 2:
                    monsterHealth -= 20;
                    break;
                case 3:
                    playerHealth = -1;
                    System.out.println("You are a failure");
                    break;
                default:
                    System.out.println("Enter vaild response");
                    break;
            }
        }
        System.out.println("Success!");
    }
}