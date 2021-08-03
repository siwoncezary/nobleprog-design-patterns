package strategy;

import java.time.LocalDate;
import java.util.List;

public class DiscountDemo {
    public static void main(String[] args) {
        Discount initial = new InitialDiscount();
        Discount birth = new BirthDayDiscount(LocalDate.of(2000,8,7), LocalDate.now());
        Discount complex = new ComplexDiscount(List.of(initial, birth));
        double percent = complex.percent();
        System.out.println(percent);
    }
}
