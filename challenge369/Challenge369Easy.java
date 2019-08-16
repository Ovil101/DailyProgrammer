/**
 * @author Ryan Lioy
 * @version 12/14/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/a0lhxx/20181126_challenge_369_easy_hex_colors/
 */
package Challenge369;

public class Challenge369Easy {
    public static void main(String[] args) {
        System.out.println(hexColor(255, 99, 71));
        System.out.println(hexColor(184, 134, 11));
        System.out.println(hexColor(189, 183, 107));
        System.out.println(hexColor(0, 0, 205));
    }

    public static String hexColor(int r, int g, int b) {
        String sr = Integer.toHexString(r), sg = Integer.toHexString(g), sb = Integer.toHexString(b);
        if (sr.length() == 1) { //toHexString(n) returns a single hex digit when n < 16 ie 15 = 0xF not 0x0F
            sr = "0" + sr;
        }
        if (sg.length() == 1) {
            sg = "0" + sg;
        }
        if (sb.length() == 1) {
            sb = "0" + sb;
        }
        return "#" + (sr + sg + sb).toUpperCase(); //TIL you can use parentheses like this
    }
}
