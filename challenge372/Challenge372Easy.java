/**
 * @author Ryan Lioy
 * @version 1/23/2019
 * @see https://www.reddit.com/r/dailyprogrammer/comments/afxxca/20190114_challenge_372_easy_perfectly_balanced/
 */
package challenge372;

public class Challenge372Easy {
    public static void main(String[] args) {
        System.out.println(isBalancedString("xxxyyy"));
        System.out.println(isBalancedString("yyyxxx"));
        System.out.println(isBalancedString("xxxyyyy"));
        System.out.println(isBalancedString("yyxyxxyxxyyyyxxxyxyx"));
        System.out.println(isBalancedString("xyxxxxyyyxyxxyxxyy"));
        System.out.println(isBalancedString(""));
        System.out.println(isBalancedString("x"));
        System.out.println(isBalancedStringBonus("xxxyyyzzz"));
        System.out.println(isBalancedStringBonus("abccbaabccba"));//
        System.out.println(isBalancedStringBonus("xxxyyyzzzz"));
        System.out.println(isBalancedStringBonus("abcdefghijklmnopqrstuvwxyz"));//
        System.out.println(isBalancedStringBonus("pqq"));
        System.out.println(isBalancedStringBonus("fdedfdeffeddefeeeefddf")); //
        System.out.println(isBalancedStringBonus("www"));
        System.out.println(isBalancedStringBonus("x"));//
        System.out.println(isBalancedStringBonus(""));
    }

    public static boolean isBalancedString(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'x') {
                x++;
            } else if (c == 'y') {
                y++;
            }
        }
        return x == y;
    }

    public static boolean isBalancedStringBonus(String s) {
        s = s.toLowerCase();
        int[] count = new int[26];
        int index = 0;
        if (s.equals("")) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) { //nested loops populate array
            for (int j = 97; j < 123; j++) {
                if (s.charAt(i) == j) {
                    count[s.charAt(i) - 97]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++) { //finds first index of nonzero value
            if (count[i] != 0) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if (count[i] != 0 && count[j] != 0) { //nested if for readability
                    if ((count[i] != 0 && count[j] != 0) && (count[index] != count[i] || count[index] != count[j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
