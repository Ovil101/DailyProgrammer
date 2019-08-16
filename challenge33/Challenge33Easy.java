/**
 * @author Ryan Lioy
 * @version 8/20/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rl24e/3302012_challenge_33_easy/
 */
package Challenge33;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
public class Challenge33Easy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            String line = readLine("D:\\Libraries\\Documents\\Java\\DailyProgrammer\\src\\wip\\Challenge33Easy.txt");
            String q = line.substring(0,line.indexOf(" "));
            String a = line.substring(line.indexOf(" ")+1);
            System.out.print("What is "+q+"? ");
            String s = scan.next();
            if (s.equals("exit")){
                break;
            }
            else if (!s.equals(a)){
                System.out.println("Wrong! Correct answer was "+a);
                break;
            }
        }
    }
    public static String readLine(String file){
        Random random = new Random();
        int r = random.nextInt(countLines("D:\\Libraries\\Documents\\Java\\DailyProgrammer\\src\\wip\\Challenge33Easy.txt"));
        String line = "";
        try{
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            for (int i = 0; i < r; i++){
                line = buffered.readLine();
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Cannot read file.");
        }
        catch(IOException ex){
            System.out.println("Error reading file.");
        }
        return line;
    }
    public static int countLines(String file){
        int count = 0;
        String line = "";
        try{
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            while ((line = buffered.readLine()) != null){
                count++;
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Cannot read file.");
        }
        catch(IOException ex){
            System.out.println("Error reading file.");
        }
        return count;
    }
}