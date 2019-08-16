/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pnhtj/2132012_challenge_5_intermediate/
 * Created: 7/4/17
 * Modified: 7/5/17
 * Author: Ryan Lioy
 * Note: Probably a better way of doing this
 */
package Challenge5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge5Intermediate {
    private static final String file = "D:\\Libraries\\Documents\\Java\\Playing Around\\Challenge5.txt";
    public static void main(String[] args){
        anagram(read(file));
    }
    public static ArrayList<String> read(String name){ //reads from the file
        ArrayList<String> words = new ArrayList<>();
        try{
            FileReader fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);
            String currentLine;
            
            br = new BufferedReader(new FileReader(name));
            while ((currentLine= br.readLine()) != null){
                words.add(currentLine);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file");
        }
        return words;
    }
    public static void anagram(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++){
            ArrayList<String> copy = words;
            String s = copy.get(i);
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            copy.remove(i); //words aren't anagrams of themselves
            for (int j = 0; j < copy.size(); j++){
                String str = copy.get(j);
                char[] strArray = str.toCharArray();
                Arrays.sort(strArray);
                if (Arrays.equals(charArray, strArray)){
                    System.out.println(str+" is an anagram of "+s);
                }
            }
        }
    }
}