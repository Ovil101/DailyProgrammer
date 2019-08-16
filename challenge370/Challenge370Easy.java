/**
 * @author Ryan Lioy
 * @version 1/7/2019
 * @see https://www.reddit.com/r/dailyprogrammer/comments/a72sdj/20181217_challenge_370_easy_upc_check_digits/
 */
package challenge370;

public class Challenge370Easy {
    public static void main(String[] args) {
        System.out.println(verify("4210000526") + " 4");
        System.out.println(verify("3600029145") + " 2");
        System.out.println(verify("12345678910") + " 4");
        System.out.println(verify("1234567") + " 0");
        System.out.println(verify("03600029145") + " 2");
    }

    public static String pad(String s, int length) {
        for (int i = 0; i < length; i++) {
            s = "0" + s; // string cat is fine as it isn't much
        }
        return s;
    }

    public static int verify(String upc) {
        if (upc.length() != 11) {
            upc = pad(upc, 11 - upc.length());
        }
        int oddSum = 0, evenSum = 0;
        char[] upcArray = upc.toCharArray();
        for (int i = 0; i < upc.length(); i += 2) { //odd index
            oddSum += Character.getNumericValue(upcArray[i]);
        }
        for (int i = 1; i < upc.length(); i += 2) { //even index
            evenSum += Character.getNumericValue(upcArray[i]);
        }
        oddSum = ((oddSum * 3) + evenSum) % 10;
        if (oddSum == 0) {
            return 0;
        }
        return 10 - oddSum;
    }
}
