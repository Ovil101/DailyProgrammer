/**
 * @author Ryan Lioy
 * @version 8/9/2019
 * @see https://www.reddit.com/r/dailyprogrammer/comments/cdieag/20190715_challenge_379_easy_progressive_taxation/
 * Nearly identical to u/usolewhiskyeseiinpole's solution but theres not many ways to do this
 */
package challenge379;

public class Challenge379Easy {
    public static void main(String[] args){
        int[] incomes = {0,10_000,10_009,10_010,12_000,56_789,1_234_567};
        for (int i : incomes){
            System.out.println(calcTax(i));
        }
    }

    public static int calcTax(int income){ // this could be done on one line but that would look awful
        double taxes = 0;
        if (income < 10_000){
            return 0;
        }
        else if (income < 30_000){ // we don't need a lower bounds since this must be >10_000
            taxes = (income-10_000)*.1;
        }
        else if (income < 100_000){
            taxes = (20000 * 0.10) + (income - 29999.99) * 0.25;
        }
        else{ // >=100_000
            taxes = (20000 * 0.10) + (69999.99 * 0.25) + (income - 100000) * 0.40;
        }
        return (int)taxes;
    }

}
