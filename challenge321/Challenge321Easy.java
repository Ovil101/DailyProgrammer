/**
 * @author Ryan Lioy
 * @version 12/27/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/6jr76h/20170627_challenge_321_easy_talking_clock/
 */
package Challenge321;
import java.util.ArrayList;
import java.util.Scanner;
public class Challenge321Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s;
        System.out.println("Enter queries: ");
        while (true){ //getting Strings to convert
            s = scan.nextLine();
            if (s.equals("end")){
                break;
            }
            else{
                list.add(s);
            }
        }
        ArrayList<StringBuilder> end = toWords(list);
        for (StringBuilder sb : end){
            System.out.println(sb);
        }
    }
    public static ArrayList<StringBuilder> toWords(ArrayList<String> entries){
        ArrayList<StringBuilder> end = new ArrayList<>();
        final String[] ones= {" twelve"," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten",
                " eleven"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
        final String[] tens = {" oh","here because I need this to be useless"," twenty"," thirty"," forty"," fifty"};
        for (String s : entries){
            StringBuilder build = new StringBuilder("It's");
            int hours = Integer.parseInt(s.substring(0,s.indexOf(':')));
            int minutes = Integer.parseInt(s.substring(s.indexOf(':')+1));
            String apm = " pm";
            if (hours < 12){
                apm = " am";
            }
            if (minutes == 0){
                build.append(ones[hours%12]+apm); //concatenation in sb append fight me
            }
            else if (minutes%10==0){
                build.append(ones[hours%12]+tens[minutes/10]+apm);
            }
            else if (minutes < 10 || minutes > 20){
                build.append(ones[hours%12]+tens[minutes/10]+ones[minutes%10]+apm);
            }
            else{
                build.append(ones[hours%12]+ones[minutes]+apm);
            }
            end.add(build);
        }
        return end;
    }
}