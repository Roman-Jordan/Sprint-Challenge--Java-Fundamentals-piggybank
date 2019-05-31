package piggyBank;

public abstract class PiggyBank{
   

    public abstract String getName();
    public abstract double getValue();

    @Override
    public String toString(){
        return getName();
    }

}