package solid.l;

/**
 * Klasa narusza zasadę podstawienia Liskov,
 * po zrzutowaniu do klasy bazowej nie można ustawić innej wysokość niż szerokość
 */
public class Square extends Rectangle{

    //Obie metody naruszają zasadę Liskov
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
