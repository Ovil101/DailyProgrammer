/**
 * @author Ryan Lioy
 * @version 9/30/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/wjzly/7132012_challenge_76_easy_title_case/
 */
package Challenge76;
import java.util.ArrayList;
import java.util.Scanner;
public class Challenge76Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = scan.nextLine();
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String str = scan.nextLine();
            if (str.equals("end")) {
                break;
            }
            else{
                list.add(str);
            }
        }
        String[] array = toStringArray(list);
        System.out.println(titleCase(s, array));
    }
    public static String titleCase(String sentence, String[] exceptions){
        StringBuilder result = new StringBuilder();
        String[] split = sentence.split(" "); //create an array of each word.
        StringBuilder thing = new StringBuilder(split[0]);
        thing.setCharAt(0, Character.toUpperCase(split[0].charAt(0)));
        result.append(thing+" "); //yes I'm using string concatenation in a .append() call, sue me.
        for (int i = 1; i < split.length; i++){
            if (!contains(split[i],exceptions)){ //if not a exception
                StringBuilder build = new StringBuilder(split[i]);
                build.setCharAt(0,Character.toUpperCase(build.charAt(0)));
                result.append(build+" ");
            }
            else if (contains(split[i],exceptions)){ //if is an exception
                result.append(split[i]+" ");
            }
        }
        return result.toString();
    }
    public static String[] toStringArray(ArrayList<String> list){
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static boolean contains(String s, String[] array){
        for (String str : array){
            if (s.equals(str)){
                return true;
            }
        }
        return false;
    }
}