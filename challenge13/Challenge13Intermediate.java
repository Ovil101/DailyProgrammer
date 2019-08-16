/**
 * @Link: https://www.reddit.com/r/dailyprogrammer/comments/pzo7g/2212012_challenge_13_intermediate/
 * @Created: 7/21/17
 * @Modified: 7/21/17
 * @Author: Ryan Lioy
 */
package Challenge13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Challenge13Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String p = scan.nextLine();
        System.out.print("Enter the string to reverse and write: ");
        String r = scan.nextLine();
        write(p,reverse(r));
    }
    public static void write(String path, String toWrite){
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter(path));
            write.write(toWrite);
            write.close();
        }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }
    public static String reverse(String s){
        // Yes I know StringBuilder has reverse()
        StringBuilder build = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            build.append(c);
        }
        return build.toString();
    }
}