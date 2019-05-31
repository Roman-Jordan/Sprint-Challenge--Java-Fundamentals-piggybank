package piggyBank;

public class Penny extends PiggyBank{
    private int penny;
    public Penny(int penny){
        this.penny = penny;
    }

    public String getName(){
        return this.penny + " Pennies";
    }

}