package solid.d;

import lombok.Data;
/*
Przykład klasy naruszającej zasadę dependency inversion.
W konstruktorze tworzymy obiekt jednej wybranej klasy!!!
 */
@Data
public class Car {
    private final Driver driver;

    public Car(){
        driver = new Driver();
    }
}
