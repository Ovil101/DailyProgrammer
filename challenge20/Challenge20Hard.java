/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/qnl1d/382012_challenge_20_difficult/
 * Created: 7/25/17
 * Modified: 7/25/17
 * Author: Ryan Lioy
 */
package Challenge20;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
public class Challenge20Hard {
    //creates popup box every 2 hours
    public static void main(String[] args){
        Timer time = new Timer();
        int interval = 7200*1000;
        time.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                JOptionPane.showMessageDialog(null,"Get back to work!");
            }
        }, 5, interval);
    }
}