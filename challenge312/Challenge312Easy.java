/**
 * @author Ryan Lioy
 * @version 3/3/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/67dxts/20170424_challenge_312_easy_l33tspeak_translator/
 * Ignores casing
 */
package challenge312; //yes I've started to format this properly

import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;

public class Challenge312Easy {

    static final String[] english = {"a","b","e","i","l","s","t"};
    static final String[] leet =    {"4","6","3","l","|","5","7"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for leet to English or 1 for English to leet");
        String s = scan.nextLine();
        if (s.charAt(0)=='e'){
            System.out.println(toEnglish(s.substring(2).toLowerCase()));
        }
        else if (s.charAt(0)=='l'){
            System.out.println(toLeet(s.substring(2).toLowerCase()));
        }
        else{
            System.out.println("Please enter valid option");
            main(args); //fight me
        }
    }

    public static StringBuilder toLeet(String s){
        StringBuilder build = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars){
            String ch = Character.toString(c);
            if (ArrayUtils.contains(english,ch)){
                int i = ArrayUtils.indexOf(english,ch);
                build.append(leet[i]);
            }
            else{
                build.append(c);
            }
        }
        return build;
    }

    public static StringBuilder toEnglish(String s){
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c=='('){
                if (i+2<=s.length()){ //checks that there is two more chars in string
                    if (s.charAt(i+1)=='v'&&s.charAt(i+2)==')'){ //check if it is (V)
                        build.append("m");
                        i+=2;
                    }
                    else if (s.charAt(i+1)=='\\'&&s.charAt(i+2)==')'){ //check if it is (\)
                        build.append("n");
                        i+=2;
                    }
                }
            }
            else{ //not a "special" character
                if (ArrayUtils.contains(leet,Character.toString(c))){
                    build.append(english[ArrayUtils.indexOf(leet,Character.toString(c))]);
                }
                else{ //not modified character
                    build.append(c);
                }
            }
            System.out.println(build);
        }
        return build;
    }
}