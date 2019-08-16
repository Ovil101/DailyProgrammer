/**
 * @author Ryan Lioy
 * @version 8/24/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rzdwq/482012_challenge_37_easy/
 */
package Challenge37;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Challenge37Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file location: ");
        System.out.println(countLines(scan.nextLine()));
    }
    public static int countLines(String file){
        int count = 0;
        try{
            String line = "";
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            while (((line = buffered.readLine()) != null)){
                count++;
            }
        }
        catch (FileNotFoundException e){
            System.err.println("FILE NOT FOUND");
        }
        catch(IOException e){
            System.err.println("ERROR READING FILE");
        }
        return count;
    }
}