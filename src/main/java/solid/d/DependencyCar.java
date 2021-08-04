package solid.d;

import lombok.Data;
/*
Klasa zachowuje zasadę dependency inversion, bo można przekazać
obiekt klasy pochodnej po Driver.
 */
@Data
public class DependencyCar {
    private final Driver driver;

    public DependencyCar(Driver driver) {
        this.driver = driver;
    }
}
