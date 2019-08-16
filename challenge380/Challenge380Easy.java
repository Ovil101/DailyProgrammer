/**
 * @author Ryan Lioy
 * @version 8/9/2019
 * @see https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
 */
package challenge380;

public class Challenge380Easy {
    public static void main(String[] args){
        String[] tests = {"sos","daily","programmer","bits","three"};
        for (String s : tests){
            System.out.println(englishToMorse(s));
        }
    }

    public static String englishToMorse(String english){
        final String[][] CONVERSION = {{"a",".-"},{"b","-..."},
                                       {"c","-.-."},{"d","-.."},
                                       {"e","."},{"f","..-."},
                                       {"g","--."},{"h","...."},
                                       {"i",".."},{"j",".---"},
                                       {"k","-.-."},{"l",".-.."},
                                       {"m","--"},{"n","-."},
                                       {"o","---"},{"p",".--."},
                                       {"q","--.-"},{"r",".-."},
                                       {"s","..."},{"t","-"},
                                       {"u","..-"},{"v","...-"},
                                       {"w",".--"},{"x","-..-"},
                                       {"y","-.--"},{"z","--.."}};
        char[] split = english.toLowerCase().toCharArray();
        String morse = "";
        for (char c : split){
            for (String[] s : CONVERSION){
                if (s[0].equals(Character.toString(c))){
                    morse+=s[1];
                }
            }
        }
        return morse;
    }

}
