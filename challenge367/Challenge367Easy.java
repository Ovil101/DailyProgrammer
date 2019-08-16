/**
 * @author Ryan Lioy
 * @version 9/9/2018
 * @see https://www.reddit.com/r/dailyprogrammer/comments/9cvo0f/20180904_challenge_367_easy_subfactorials_another/
 */
package challenge367;

public class Challenge367Easy {
    public static void main(String[] args){
        System.out.println(subfactorial(6));
        System.out.println(subfactorial(9));
        System.out.println(subfactorial(14));
        System.out.println(subfactorial(20));
    }

    public static long subfactorial(int a){ //yay recursion
        if (a==1){
            return 0;
        }
        else if (a==2){
            return 1;
        }
        else if (a==3){
            return 2;
        }
        return (a-1)*(subfactorial(a-1)+subfactorial(a-2));
    }
}
