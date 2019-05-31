package piggyBank;

public class Dollars extends PiggyBank{
    private int dollars;
    
    public Dollars(int dollars){
        this.dollars = dollars;
    }

    public Dollars(){
        this.dollars = this.dollars + 1;
    }

    public String getName(){
        String plural = dollars > 1 ? "s":"";
        return this.dollars + " Dollar" + plural;
    }

}