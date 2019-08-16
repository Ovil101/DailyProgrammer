/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pr2xr/2152012_challenge_7_easy/
 * Created: 7/21/17
 * Modified: 7/27/17
 * Author: Ryan Lioy
 * Note: Longer than it should be since indexOf() returns -1 if item not found
 */
package Challenge7;
import java.util.Scanner;
public class Challenge7Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(toEnglish(s));
    }
    public static String toEnglish(String code){
        //final because it should not be changed
        final String[][] letters = {{".-","A"},{"-...","B"},{"-.-.","C"},{"-..","D"},
                             {".","E"},{"..-.","F"},{"--.","G"},{"....","H"},
                             {"..","I"},{".---","J"},{"-.-","K"},{".-..","L"},
                             {"--","M"},{"-.","N"},{"---","O"},{".--.","P"},
                             {"--.-","Q"},{".-.","R"},{"...","S"},{"-","T"},
                             {"..-","U"},{"...-","V"},{".--","W"},{"-..-","X"},
                             {"-.--","Y"},{"--..","Z"}};
        StringBuilder morse = new StringBuilder(code);
        String english = "";
        while(morse.length()!=0){
            int index = morse.indexOf("/");
            if (index != -1){ //because indexOf() returns -1 if value can't be hound
                StringBuilder word = new StringBuilder(morse.substring(0, index));
                morse.delete(0, morse.indexOf("/")+1);
                while (word.length() != 0){ //for word in morse
                    String letter = word.substring(0,word.indexOf(" ")); //get the letter
                    word.delete(0, word.indexOf(" ")+1); //delete the letter from morse
                    for (int i = 0; i < letters.length; i++){ //find item in letters
                        if (letter.equals(letters[i][0])){
                            english += letters[i][1]; //adds english letter to translated String
                        }
                    }
                }
                english += " "; //adds a space after each word, extra one at the end of string
            }
            else if (index == -1){
                StringBuilder word = new StringBuilder(morse.substring(0));
                morse.setLength(0); //clear morse
                while (word.length() != 0){
                    int sIndex = word.indexOf(" "); //index of end of letter
                    if (sIndex != -1){
                        String letter = word.substring(0,sIndex); //the letter
                        word.delete(0, word.indexOf(" ")+1); //remove letter from word
                        for (int i = 0; i < letters.length; i++){ //find letter in letters
                            if (letter.equals(letters[i][0])){
                                english += letters[i][1]; //assign to translated String
                            }
                        }
                    }
                    else if (sIndex == -1){
                        String letter = word.substring(0); //get rest of String
                        word.setLength(0); //clear word
                        for (int i = 0; i < letters.length; i++){
                            if (letter.equals(letters[i][0])){ //find item in letters
                                english += letters[i][1];
                            }
                        }
                    }
                }
                english += " "; //adds english letter to translated String
            }
        }
        return english;
    }
}