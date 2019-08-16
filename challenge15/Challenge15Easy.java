/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/q4c34/2242012_challenge_15_easy/
 * Created: 7/23/17
 * Modified: 7/28/17
 * Author: Ryan Lioy
 */
package Challenge15;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge15Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        justify(readLine(scan.nextLine()));
    }
    public static ArrayList<String> readLine(String file){ //reads from file, converts to arraylist
        ArrayList<String> list = new ArrayList<>();
        try{
            String line = "";
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            while ((line = buffered.readLine()) != null){
                list.add(line);
            }
        }
        catch (IOException e){
            System.out.println("Error reading file.");
        }
        return list;
    }
    public static void justify(ArrayList<String> list){
        for (String s : list){
            System.out.println(String.format("%1$10s",s)); //justify right
        }
    }
}