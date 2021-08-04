package solid.l;

public class RectangleDemo {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(10);
        System.out.println(square);
        //Obiekt pochodny po zrzutowaniu do klasy bazowej
        //powinien zachowywać się jak obiekt klasy bazowej
        Rectangle rectangle = square;
        //chcemy prostokąt  o wymiarach 10 x 5
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        //a otrzymujemy kwadrat o wymiarach 5 x 5
        System.out.println(rectangle);
        //Klasa Square narusza zasadę podstawienia Liskov

        Rectangle rectangleSquare = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(5);

    }
}
