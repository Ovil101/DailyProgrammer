/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pp53w/2142012_challenge_6_easy/
 * Created: 7/5/17
 * Modified: 7/8/17
 * Author: Ryan Lioy
 * Note: Done using the Gauss-Legendre algorithm
 */
//3.1415926535897940041763831686
package challenge6;
import java.math.BigDecimal;
public class Challenge6Easy {
    public static void main(String[] args){
        double a = 1;
        double b = 1/Math.sqrt(2);
        double t = 1/4.0;
        double p = 1;
        for (int i = 0; i < 5; i++){
            double aC = (a+b)/2;
            double bC = Math.sqrt(a*b);
            double tC = t-p*Math.pow(a-aC, 2);
            double pC = 2*p;
            //copy variables over
            a = aC;
            b = bC;
            t = tC;
            p = pC;    
        }
        BigDecimal PI = new BigDecimal(Math.pow((a+b),2)/(4*t));
        String piString = PI.toString().substring(0,30);
        System.out.println(piString);
    }
}