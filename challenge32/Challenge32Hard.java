/**
 * @author Ryan Lioy
 * @version 8/18/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/rhrr0/3282012_challenge_32_difficult/
 * So I forgot to put a header on this file, but this was done like a week ago. Also, do I need to print this?
 */
package Challenge32;
public class Challenge32Hard {
    public static void main(String[] args){
        char c = 34; //did not know you could do this
        String[] l = {

                "package InProgess;",
                "public class Challenge32Hard {",
                "    public static void main(String[] args){",
                "    char c = 34; //did not know you could do this",
                "    String[] l = {",
                "    ",
                "    };",
                "    for(int i = 0; i < 6; i++)",
                "        System.out.println(l[i]);",
                "    for(int i = 0; i < l.length; i++)",
                "        System.out.println(l[6] + c + l[i] + c + ','');",
                "    for(int i = 7; i < l.length; i++)",
                "        System.out.println(l[i]);",
                "    }",
                "}"};
        for(int i = 0; i < 6; i++)
            System.out.println(l[i]);
        for(int i = 0; i < l.length; i++)
            System.out.println(l[5] + c + l[i] + c + ',');
        for(int i = 7; i < l.length; i++)
            System.out.println(l[i]);
    }
}