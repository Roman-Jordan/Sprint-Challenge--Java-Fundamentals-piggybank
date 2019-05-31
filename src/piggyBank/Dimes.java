package piggyBank;

public class Dimes extends PiggyBank{
    private int dimes;
    
    public Dimes(int dimes){
        this.dimes = dimes;
    }

    public Dimes(){
        this.dimes = this.dimes + 1;
    }

    public String getName(){
        return this.dimes + " Dimes";
    }

}