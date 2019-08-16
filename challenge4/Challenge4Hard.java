/**
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pm7g7/2122012_challange_4_difficult/
 * Created: 7/3/17
 * Modified: 7/3/17
 * Author: Ryan Lioy
 * Note: Probably a more efficient way to do this, but this works
 */
package Challenge4;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge4Hard {
    public static void main(String[] args){
        int[][] array = {{4,2,8},{6,2,12},{6,2,3},{9,12,108},{4,16,64}};
        System.out.println(count(array));
    }
    public static ArrayList<String> count(int[][] cases){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < cases.length; i++){
            //add
            if (cases[i][0]+cases[i][1]==cases[i][2]){
                result.add(cases[i][0]+"+"+cases[i][1]+"="+cases[i][2]);
            }
            if(cases[i][0]+cases[i][2]==cases[i][1]){
                result.add(cases[i][0]+"+"+cases[i][2]+"="+cases[i][1]);
            }
            if(cases[i][1]+cases[i][0]==cases[i][2]){
                result.add(cases[i][1]+"+"+cases[i][0]+"="+cases[i][2]);
            }
            if(cases[i][1]+cases[i][2]==cases[i][0]){
                result.add(cases[i][1]+"+"+cases[i][2]+"="+cases[i][0]);
            }
            if(cases[i][2]+cases[i][0]==cases[i][1]){
                result.add(cases[i][2]+"+"+cases[i][0]+"="+cases[i][1]);
            }
            if(cases[i][1]+cases[i][2]==cases[i][0]){
                result.add(cases[i][1]+"+"+cases[i][2]+"="+cases[i][0]);
            }
            //sub
            if(cases[i][0]-cases[i][1]==cases[i][2]){
                result.add(cases[i][0]+"-"+cases[i][1]+"="+cases[i][2]);
            }
            if(cases[i][1]-cases[i][0]==cases[i][2]){
                result.add(cases[i][1]+"-"+cases[i][0]+"="+cases[i][2]);
            }
            if(cases[i][1]-cases[i][2]==cases[i][0]){
                result.add(cases[i][1]+"-"+cases[i][2]+"="+cases[i][0]);
            }
            if(cases[i][0]-cases[i][2]==cases[i][1]){
                result.add(cases[i][0]+"-"+cases[i][2]+"="+cases[i][1]);
            }
            if(cases[i][2]-cases[i][1]==cases[i][0]){
                result.add(cases[i][2]+"-"+cases[i][1]+"="+cases[i][0]);
            }
            if(cases[i][1]-cases[i][0]==cases[i][2]){
                result.add(cases[i][1]+"-"+cases[i][0]+"="+cases[i][2]);
            }
            //div
            if(cases[i][0]/cases[i][1]==cases[i][2]){
                result.add(cases[i][0]+"/"+cases[i][1]+"="+cases[i][2]);
            }
            if(cases[i][0]/cases[i][2]==cases[i][1]){
                result.add(cases[i][0]+"/"+cases[i][2]+"="+cases[i][1]);
            }
            if(cases[i][1]/cases[i][0]==cases[i][2]){
                result.add(cases[i][1]+"/"+cases[i][0]+"="+cases[i][2]);
            }
            if(cases[i][1]/cases[i][2]==cases[i][0]){
                result.add(cases[i][1]+"/"+cases[i][2]+"="+cases[i][0]);
            }
            if(cases[i][2]/cases[i][1]==cases[i][0]){
                result.add(cases[i][2]+"/"+cases[i][1]+"="+cases[i][0]);
            }
            if(cases[i][2]/cases[i][0]==cases[i][1]){
                result.add(cases[i][2]+"/"+cases[i][0]+"="+cases[i][1]);
            }
            //mul
            if(cases[i][0]*cases[i][1]==cases[i][2]){
                result.add(cases[i][0]+"*"+cases[i][1]+"="+cases[i][2]);
            }
            if(cases[i][0]*cases[i][2]==cases[i][1]){
                result.add(cases[i][0]+"*"+cases[i][2]+"="+cases[i][1]);
            }
            if(cases[i][1]*cases[i][0]==cases[i][2]){
                result.add(cases[i][1]+"*"+cases[i][0]+"="+cases[i][2]);
            }
            if(cases[i][1]*cases[i][2]==cases[i][0]){
                result.add(cases[i][1]+"*"+cases[i][2]+"="+cases[i][0]);
            }
            if(cases[i][2]*cases[i][0]==cases[i][1]){
                result.add(cases[i][2]+"*"+cases[i][0]+"="+cases[i][1]);
            }
            if(cases[i][2]*cases[i][1]==cases[i][0]){
                result.add(cases[i][2]+"*"+cases[i][1]+"="+cases[i][0]);
            }
        }
        return result;
    }
}