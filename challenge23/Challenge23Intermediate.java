/**
 * @see https://www.reddit.com/r/dailyprogrammer/comments/qulnf/3132012_challenge_23_intermediate/
 * @version 7/30/17
 * @author Ryan Lioy
 */
package Challenge23;
public class Challenge23Intermediate {
    public static void main(String[] args) {
        nugget();
    }
    public static void nugget(){
        for (int i = 1; i < 44; i++){
            if (!isNuggetNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isNuggetNumber(int n){  //uses recursion
        int six = n-6;
        int nine = n-9;
        int twenty = n-20;
        if (six == 0){
            return true; //is 6
        }
        else if (nine == 0){
            return true; //is 9
        }
        else if (twenty == 0){
            return true; //is 20
        }
        else if (six < 0){ //is not 
            return false;
        }
        return isNuggetNumber(six) || isNuggetNumber(nine) || isNuggetNumber(twenty);
    }
}