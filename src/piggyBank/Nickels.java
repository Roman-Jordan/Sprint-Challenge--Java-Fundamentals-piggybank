package piggyBank;

public class Nickels extends PiggyBank{
    private int nickels;
    
    public Nickels(int nickels){
        this.nickels = nickels;
    }

    public Nickels(){
        this.nickels = this.nickels + 1;
    }

    public String getName(){
        String plural = nickels > 1 ? "s":"";
        return this.nickels + " Nickel" + plural;
    }

}