package strategy;

import java.util.List;

public class ComplexDiscount implements Discount{
    private final List<Discount> discountList;

    public ComplexDiscount(List<Discount> discountList) {
        this.discountList = discountList;
    }

    @Override
    public double percent() {
        return discountList.stream().map(Discount::percent).max(Double::compare).orElse(0d);
    }
}
