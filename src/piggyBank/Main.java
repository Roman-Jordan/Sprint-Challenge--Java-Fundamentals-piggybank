package piggyBank;

//imports
import java.util.*;

public class Main{
    public static void main(String[] args){

        ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();
        piggyBank.add(new Penny(100));
        piggyBank.add(new Quarters());
        piggyBank.add(new Dimes());
        piggyBank.add(new Dollars(5));
        piggyBank.add(new Nickels(3));
        piggyBank.add(new Dimes(7));
        piggyBank.add(new Dollars());
        piggyBank.add(new Penny(10));
        System.out.println(piggyBank);
    }
}
