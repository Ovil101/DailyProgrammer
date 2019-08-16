/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pwox3/2192012_challenge_11_intermediate/
 * Created: 7/17/17
 * Modified: 7/17/17
 * Author: Ryan Lioy
 */
package Challenge11;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Challenge11Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter strobogrammatic number to find next strobogrammatic number:");
        strobogrammaticCount(scan.nextInt());
    }
    public static void strobogrammaticCount(int n){ //n must be a strobo number
        String num = "";
        int i = 0, next = 0;
        int count = 0;
        while(true){ //finds next strobogrammatic number after n
            num = Integer.toString(i); //convert to String
            if (!(num.contains("3") || num.contains("4") || num.contains("7"))){
                if (i == reverseAndRotate(i)){
                    if (i > n){
                        next = i;
                        break;
                    }
                }
            }
            i++;
        }
        for (i = 0; i <= 10000; i++){ //prints strobogrammatic numbers less than 10000
            num = Integer.toString(i);
            if (!(num.contains("3") || num.contains("4") || num.contains("7"))){
                if (i == reverseAndRotate(i)){
                    count++;
                }
            }
        }
        System.out.println("Count: "+count+"\n"+"Next: "+next);
    }
    public static int reverseAndRotate(int n){ //reverses an int
        String number = Integer.toString(n); //convert n to string
        number = new StringBuilder(number).reverse().toString();
        String reversed = "";
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            reversed += rotate(c);
        }
        return Integer.parseInt(reversed);
    }
    public static char rotate(char c){ //switches 6 and 9 and 2 and 5
        switch(c){
            case '6':
                return '9';
            case '9':
                return '6';
            case '2':
                return '5';
            case '5':
                return '2';
            default:
                return c;
        }
    }
}