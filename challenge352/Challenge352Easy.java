/**
 * @author Ryan Lioy
 * @version 5/25/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/7yyt8e/20180220_challenge_352_easy_making_imgurstyle/
 */
package Challenge352;

public class Challenge352Easy {
    //because I didn't want to format it
    final static char[] base = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static void main(String[] args) {
        System.out.println(toBase(187621));
        System.out.println(toBase(237860461));
        System.out.println(toBase(2187521));
        System.out.println(toBase(18752));
        System.out.println(toBase(125));
    }

    public static StringBuilder toBase(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(base[n % 62]); //NEED FOR SPEED: STRINGBUILDER
            n /= 62;
        }
        return result;
    }
}
