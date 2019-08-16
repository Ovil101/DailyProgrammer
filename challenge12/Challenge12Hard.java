/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pxsew/2202012_challenge_12_difficult/
 * Created: 7/22/17
 * Modified: 7/22/17
 * Author: Ryan Lioy
 * Note: Uses JFugue library
 */
package challenge12;
import org.jfugue.player.Player;
import java.util.Scanner;
public class Challenge12Hard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String s = scan.next().toUpperCase();
            if (s.equals("END")){
                break;
            }
            else{
                playNote(s);
            }
        }
    }
    public static void playNote(String note){
        Player player = new Player();
        switch(note){
            case "A":
                player.play("A");
                break;
            case "B":
                player.play("B");
                break;
            case "C":
                player.play("C");
                break;
            case "D":
                player.play("D");
                break;
            case "E":
                player.play("E");
                break;
            case "F":
                player.play("F");
                break;
            case "G":
                player.play("G");
                break;
        }
    }
}