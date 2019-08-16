/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pserp/2162012_challenge_8_easy/
 * Created: 7/9/17
 * Modified: 7/9/17
 * Author: Ryan Lioy
 */
package Challenge8;
public class Challenge8Easy {
    public static void main(String[] args){
        for (int i = 100; i > 0; i--){
            int n = i;
            System.out.println(n+" bottles of beer on the wall, "+n+" bottles of bear.\n"
                    + "Take one down, pass it around "+(n-1)+" bottles of beer on the wall.");
        }
    }
}