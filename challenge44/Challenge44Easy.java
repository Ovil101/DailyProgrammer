/**
 * @author Ryan Lioy
 * @version 8/30/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/srowj/4252012_challenge_44_easy/
 */
package Challenge44;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Challenge44Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String file = read(scan.nextLine());
        System.out.println("Words: "+wordCount(file));
        System.out.println("Sentences: "+sentenceCount(file));
    }
    public static String read(String file){
        String line = "";
        String text = "";
        try{
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            while ((line = buffered.readLine()) != null){
                text+=line;
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Cannot read file.");
        }
        catch(IOException ex){
            System.out.println("Error reading file.");
        }
        return text;
    }
    public static int wordCount(String text){
        int words = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                words++;
            }
            else if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!'){
                words++;
                i++; //will count the space after a sentence as another word, thus counting the word twice.
            }
        }
        return words;
    }
    public static int sentenceCount(String text){
        int sentences = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?'){
                sentences++;
            }
        }
        return sentences;
    }
}