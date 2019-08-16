/**
 * @author Ryan Lioy
 * @version 8/29/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/shp28/4192012_challenge_41_easy/
 */
package Challenge41;
import java.util.Scanner;
public class Challenge41Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String print = scan.nextLine();
        int length = print.length()+6;
        for(int i = 0; i < length; i++){
            System.out.print('*');
        }
        System.out.print("\n*");
        for(int i = 0; i < length-2; i++){
            System.out.print(' ');
        }
        System.out.print("*\n*  ");
        System.out.print(print + "  *\n*");
        for(int i = 0; i < length-2; i++){
            System.out.print(' ');
        }
        System.out.print("*\n");
        for(int i = 0; i < length; i++){
            System.out.print('*');
        }
    }
}
