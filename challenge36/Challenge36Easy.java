/**
 * @author Ryan Lioy
 * @version 8/22/2017
 * @see https://www.reddit.com/r/dailyprogrammer/comments/ruiob/452012_challenge_36_easy/
 */
package Challenge36;
public class Challenge36Easy {
    public static void main(String[] args){
        // closed = 0, open = 1
        int[] lockers = new int[1000];
        int open = 0;
        for (int i = 1; i <= 1000; i++){
            for (int j = 0; j < lockers.length; j++){
                if ((j+1)%i == 0){
                    if (lockers[j] == 0){
                        lockers[j] = 1;
                    }
                    else{ // equals 1
                        lockers[j] = 0;
                    }
                }
            }
        }
        for (int i : lockers){
            if (i == 1){
                open++;
            }
        }
        for (int i = 0; i < lockers.length; i++){
            if (lockers[i] == 1){
                System.out.println("POSITION: "+(i+1)+" STATE: "+lockers[i]);
            }
        }
        System.out.println("OPEN LOCKERS: "+open);
    }
}