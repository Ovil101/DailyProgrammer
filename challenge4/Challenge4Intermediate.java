/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pm6sq/2122012_challenge_4_intermediate/
 * Created: 7/3/17
 * Modified: 7/3/17
 * Author: Ryan Lioy
 * Note: Does using the JS method eval() count as cheating? NO EXPONENTS!
 */
package Challenge4;
import java.util.Scanner;
import javax.script.*;
public class Challenge4Intermediate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter math:");
        String s = scan.next();
        try{
            ScriptEngineManager m = new ScriptEngineManager();
            ScriptEngine e = m.getEngineByName("js");        
            Object result = e.eval(s);
            System.out.println(String.valueOf(result));
        }
        catch(ScriptException e){
            System.out.println("Error: Unknown operator/character");
        }
    }
}