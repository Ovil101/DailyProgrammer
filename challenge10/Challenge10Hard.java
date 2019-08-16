/**
 * @Link: https://www.reddit.com/r/dailyprogrammer/comments/pv92x/2182012_challenge_10_difficult/
 * @Created: 7/15/17
 * @Modified: 7/21/17
 * @Author: Ryan Lioy
 */
package Challenge10;
import java.util.Scanner;
import java.util.Random;
public class Challenge10Hard {
    public static void main(String[] args){
        String[] words = {"cake","waffle","python","java","nugget"}; //possible words
        String guessed = "";
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        String word = words[r.nextInt(words.length)]; //random string from array
        String guessedLetters = "";
        StringBuilder hidden = new StringBuilder();
        for (int i = 0; i < word.length(); i++){ //create hidden word
            hidden.append("-");
        }
        int tries = 7;
        while (tries > 0){
            if (tries == 7){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");               
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    int index = word.indexOf(guess);
                    hidden.replace(index, index+1, guess);
                    guessed += guess;
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            if (tries == 6){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");               
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            else if (tries == 5){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");               
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            else if (tries == 4){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|       /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");               
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            else if (tries == 3){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|       /|\\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");             
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            else if (tries == 2){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|       /|\\");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");             
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            else if (tries == 1){
                System.out.println();
                System.out.println("|---------");
                System.out.println("|        |");
                System.out.println("|        O");
                System.out.println("|       /|\\");
                System.out.println("|        |");
                System.out.println("|       /  ");
                System.out.println("|");
                System.out.println("|");             
                System.out.println("Word: "+hidden);
                System.out.println("Guessed letters: "+guessed);
                System.out.print("Enter your guess: ");
                String guess = scan.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i < word.length(); i++){
                        String t = word.charAt(i)+""; //convert to string
                        if (t.equals(guess)){
                            hidden.setCharAt(i, word.charAt(i));
                            guessed += guess;
                        }
                    }
                }
                else{
                    guessed += guess;
                    tries--;
                }
            }
            if (word.equals(hidden.toString())){
                System.out.println("You guessed the word! It was "+word+".");
                break;
            }
        }
        if (tries == 0){
            System.out.println("|---------");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|        |");
            System.out.println("|       / \\");
            System.out.println("|");
            System.out.println("|");       
            System.out.println("The word was: "+word);
        }
    }
}