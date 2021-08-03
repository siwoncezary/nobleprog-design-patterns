package strategy;

import java.time.LocalDate;

public class BirthDayDiscount implements Discount{
    private final LocalDate birthDate;
    private final LocalDate now;

    public BirthDayDiscount(LocalDate birthDate, LocalDate now) {
        this.birthDate = birthDate;
        this.now = now;
    }


    @Override
    public double percent() {
        if (birthDate.equals(now.withYear(birthDate.getYear()))){
            return 5;
        } else {
            return 0;
        }
    }
}
