/**
 * @author Ryan Lioy
 * @version 1/2/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/u0tdt/5232012_challenge_56_easy/
 */
package Challenge56;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Challenge56Easy {
    public static void main(String[] args){
        char c = 'a';
        try{
            print("",c);
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
    public static void print(String s, char c) throws IOException{ //file generated by this crashes Notepad++!
        BufferedWriter write = new BufferedWriter(new FileWriter("D:\\Libraries\\Documents\\Java\\DailyProgrammer\\056easy.txt"));
        if (c != '{'){
            print(s+c+s,++c);
        }
        else{
            write.write(s);
            write.close();
        }
    }
}