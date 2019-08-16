/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pu1y6/2172012_challenge_9_intermediate/
 * Created: 7/11/17
 * Modified: 7/11/17
 * Author: Ryan Lioy
 * Note: Does not write back to file, just prints file with changed String
 */
package Challenge9;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Challenge9Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a String to find:");
        String find = scan.nextLine();
        System.out.println("Enter a what to replace with:");
        String replace = scan.nextLine();
        System.out.println("Enter path to file:");
        String file = scan.nextLine();
        System.out.println(findReplace(read(file), find, replace));
    }
    public static String read(String path){ //read from file
        StringBuilder build = new StringBuilder();
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){ //add each line to build
                build.append(line);
            }
        }
        catch(IOException e){ //because reading can throw this
            System.out.println("Error reading file");
        }
        return build.toString();
    }
    public static String findReplace(String s, String toFind, String replace){ //replace in string
        s = s.replace(toFind, replace); //replace toFind with replace
        return s;
    }
}