package piggyBank;

public class Quarters extends PiggyBank{
    private int quarters;
    
    public Quarters(int quarters){
        this.quarters = quarters;
    }

    public Quarters(){
        this.quarters = this.quarters + 1;
    }

    public String getName(){
        String plural = quarters > 1 ? "s":"";
        return this.quarters + " Quarter" + plural;
    }

}