package piggyBank;

public class Penny extends PiggyBank{
    private int penny;
    
    public Penny(int penny){
        this.penny = penny;
    }

    public Penny(){
        this.penny = this.penny + 1;
    }

    public String getName(){
        String plural = penny > 1 ? " Pennies":" Penny";
        return this.penny + plural;
    }

}