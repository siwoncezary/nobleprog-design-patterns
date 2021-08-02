package revision;

import java.math.BigDecimal;

public class Tomato extends Product{
    private final boolean isPacked;
    private final double weight;

    public Tomato(BigDecimal price, String name, String code, boolean isPacked, double weight) {
        super(price, name, code);
        this.isPacked = isPacked;
        this.weight = weight;
    }

    @Override
    public UnitQuantity getUnitQuantity() {
        return UnitQuantity.KG;
    }

    @Override
    public double getQuantity() {
        return weight;
    }

    public boolean isPacked() {
        return isPacked;
    }
}
