package strategy;

public class InitialDiscount implements Discount{
    private final static double INITIAL = 2;
    @Override
    public double percent() {
        return INITIAL;
    }
}
