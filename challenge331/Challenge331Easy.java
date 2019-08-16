/**
 * @author Ryan Lioy
 * @version 10/13/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/6ze9z0/20170911_challenge_331_easy_the_adding_calculator/
 */
package Challenge331;
import java.util.Scanner;
/*
Does the challenge at hand by manipulating Strings. The bonus wouldn't be too hard
to do as you would just have to change all calls of Integer.parseInt() to its. I couldn't
find out how Integer.parseInt() works so I don't know if it breaks any rules.
Double counterpart.
 */
public class Challenge331Easy {
    final static String[] array = {}; //for calling main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter calculation: ");
            String s = scan.nextLine();
            if (s.equals("end")){
                System.exit(0);
            }
            else if (s.contains("/") && !s.contains("*") && !s.contains("+") && !s.contains("^")){
                System.out.println(divide(s));
            }
            else if (s.contains("+")){
                System.out.println(add(s));
            }
            else if (s.contains("-") && !s.contains("*") && !s.contains("+") && !s.contains("^")){
                System.out.println(subtract(s));
            }
            else if (s.contains("*")){
                System.out.println(multiply(s));
            }
            else if (s.contains("^")){
                System.out.println(pow(s));
            }
        }
    }
    public static int add(String s){ //just normal addition
        return Integer.parseInt(s.substring(0,s.indexOf("+")))+Integer.parseInt(s.substring(s.indexOf("+")+1));
    }
    public static int multiply(String s){ //addition via a for loop
        int one = Integer.parseInt(s.substring(0,s.indexOf("*",1))); //get first integer
        int two = Integer.parseInt(s.substring(s.indexOf("*")+1)); //get second integer
        int prod = 0;
        if (one<0){
            for (int i = 0; i < abs(two); i++){
                prod+=abs(one); //I assume that += is allowed since it is just prod = prod + abs(one)
            }
        }
        else{
            for (int i = 0; i < abs(one); i++){
                prod+=two;
            }
        }
        return prod;
    }
    public static int divide(String s){
        int ans = 0;
        int one = Integer.parseInt(s.substring(0,s.indexOf("/")));
        int two = Integer.parseInt(s.substring(s.indexOf("/")+1));
        try{
            if (abs(one)%abs(two)!=0){ //does not divide evenly
                System.out.println("Non integral answer");
                main(array);
            }
            else{ //does divide evenly
                int value = 0; //count of what multiple of one the loop is at.
                if (one>=0 && two>0){ //both are positive
                    while (true){
                        if (value < one){
                            ans++;
                            value+=two;
                        }
                        else{
                            break;
                        }
                    }
                }
                else if(one<=0 && two>0 || one>=0 && two<0){ //if denominator or numerator is negative
                    one = abs(one);
                    two = abs(two);
                    while (true){
                        if (value < one){
                            ans++;
                            value+=two;
                        }
                        else{
                            ans = Integer.parseInt("-"+ans);
                            break;
                        }
                    }
                }
                else if(one<0 && two<0){ //if both are negative
                    one = abs(one);
                    two = abs(two);
                    while (true){
                        if (value < one){
                            System.out.println("ONE "+one);
                            System.out.println("TWO "+two);
                            System.out.println("ANS "+ans);
                            ans++;
                            value+=two;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        catch(ArithmeticException e){ //for catching division by zero
            System.out.println("Not defined");
            System.exit(0);
        }
        return ans;
    }
    public static int subtract(String s){
        int one = 0;
        int two = 0;
        if (occurrencesOfChar(s,'-')==1){ //subtracting two positive numbers, make second number negative
            one = Integer.parseInt(s.substring(0,indexOf('-',s,1)));
            two = Integer.parseInt(s.substring(s.indexOf("-")));
        }
        else if (occurrencesOfChar(s,'-')==2){ //subtracting one negative and one positive
            if (s.charAt(0)=='-'){ //first number is negative, include negative
                one = Integer.parseInt(s.substring(0,indexOf('-',s,2)));
                System.out.println("ONE: "+one);
                two = Integer.parseInt(s.substring(indexOf('-',s,2)));
                System.out.println("TWO: "+two);
            }
            else{ //second number is negative, remove negative
                one = Integer.parseInt(s.substring(0,indexOf('-',s,1)));
                System.out.println("ONE: "+one);
                two = Integer.parseInt(s.substring(indexOf('-',s,2)+1));
                System.out.println("TWO: "+two);
            }
        }
        else if (occurrencesOfChar(s,'-')==3){ //if both numbers are negative, include the negatives
            one = Integer.parseInt(s.substring(0,indexOf('-',s,2)));
            two = Integer.parseInt(s.substring(indexOf('-',s,3)+1));
        }
        return one+two;
    }
    public static int pow(String s){
        int base = Integer.parseInt(s.substring(0,s.indexOf("^")));
        int exponent = Integer.parseInt(s.substring(s.indexOf("^")+1));
        int ans = base;
        if (exponent<0){ //negative exponent
            System.out.println("Non integral number.");
            System.exit(0);
        }
        else if (base == 0 && exponent == 0){ //0^0 is undefined
            System.out.println("Undefined");
            System.exit(0);
        }
        else if (base==0){ //0^x = 0
            return 0;
        }
        else if (exponent==0){ //x^0 = 1
            return 1;
        }
        else if (exponent==1){ //1^x = 1
            return base;
        }
        else{
            for (int i = 1; i < abs(exponent); i++){
                ans = multiply(ans+"*"+base);
            }
        }
        return ans;
    }
    public static int indexOf(char c, String s, int place){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==c){
                count++;
            }
            if (place==count){
                return i;
            }
        }
        return -1;
    }
    public static int occurrencesOfChar(String s, char c){ //used in subtraction to determine number of negatives
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static int abs(int i){
        StringBuilder build = new StringBuilder(Integer.toString(i));
        if (build.charAt(0)=='-'){
            build.deleteCharAt(0);
        }
        return Integer.parseInt(build.toString());
    }
}