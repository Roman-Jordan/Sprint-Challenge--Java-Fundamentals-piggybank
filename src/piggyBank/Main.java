package piggyBank;

//imports
import java.util.*;
import java.text.DecimalFormat;

public class Main{
    
    public static void main(String[] args){

        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();
        piggyBank.add(new Quarters());
        piggyBank.add(new Dimes());
        piggyBank.add(new Dollars(5));
        piggyBank.add(new Nickels(3));
        piggyBank.add(new Dimes(7));
        piggyBank.add(new Dollars());
        piggyBank.add(new Penny(10));
        
        //Sum of all piggyBank.getValue();
        double money = 0;
        for(PiggyBank v:piggyBank){
            money+=v.getValue();
        }

        piggyBank.forEach(v -> System.out.println(v.getName()));
        System.out.println();

        System.out.println("The piggy bank holds " + fp.format(money));
    }
}
