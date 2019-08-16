/**
 * @author Ryan Lioy
 * @version 1/21/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/4q35ip/20160627_challenge_273_easy_getting_a_degree/
 */
package Challenge273;
import java.util.Scanner;
public class Challenge273Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        while(true){
            s = scan.nextLine();
            if (s.equals("end")){
                break;
            }
            String parameters = s.substring(s.length()-2);
            switch (parameters){
                default:
                    System.out.println("No valid conversion");
                    break;
                case "rd":
                    System.out.println(radToDeg(Double.valueOf(s.substring(0,s.length()-2)))+"d");
                    break;
                case "dr":
                    System.out.println(degToRad(Double.valueOf(s.substring(0,s.length()-2)))+"r");
                    break;
                case "fc":
                    System.out.println(fToC(Double.valueOf(s.substring(0,s.length()-2)))+"c");
                    break;
                case "fk":
                    System.out.println(fToK(Double.valueOf(s.substring(0,s.length()-2)))+"k");
                    break;
                case "cf":
                    System.out.println(cToF(Double.valueOf(s.substring(0,s.length()-2)))+"f");
                    break;
                case "ck": //something something louis ck
                    System.out.println(cToK(Double.valueOf(s.substring(0,s.length()-2)))+"k");
                    break;
                case "kc":
                    System.out.println(kToC(Double.valueOf(s.substring(0,s.length()-2)))+"c");
                    break;
                case "kf":
                    System.out.println(kToF(Double.valueOf(s.substring(0,s.length()-2)))+"f");
                    break;
            }
        }
    }
    public static double radToDeg(double rad){
        return (180/Math.PI)*rad;
    }
    public static double degToRad(double deg){
        return (Math.PI/180)*deg;
    }
    public static double fToC(double f){
        return (f-32.0)*(5.0/9.0); //took me 20 minutes to realize i was getting the wrong answer due of int division
    }
    public static double fToK(double f){
        return cToK(fToC(f));
    }
    public static double cToF(double c){
        return (c*(9.0/5.0))+32.0;
    }
    public static double cToK(double c){
        return c+273.0;
    }
    public static double kToC(double k){
        return k-273.0;
    }
    public static double kToF(double k){
        return cToF(kToC(k));
    }
}