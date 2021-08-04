package solid.o;

import java.util.List;

public class PictureDemo {
    public static void main(String[] args) {

        //Ta klasa jest zamknięta na rozbudowę i łamie zasadę Open/Closed
        //Dodanie nowego obiektu interfesju Drawable (Circle) wymaga zmiany
        //w kodzie klasy Picture, dodanie następnego warunku
        //if(obj instanceof NowaKlasa)
        Picture picture = new Picture(List.of(
                new Rectangle(),
                new Section(),
                new Rectangle(),
                new Circle()
        ));
        picture.draw();
        //Tak klasa jest zgodna z Open/Closed
        //Dodanie nowej klasy implementujące Drawable nie wymaga zmian
        //w kodzie klasy OpenPicture
        OpenPicture openPicture = new OpenPicture(List.of(
                new Rectangle(),
                new Section(),
                new Rectangle(),
                new Circle(),
                new OpenPicture(List.of(
                        new Rectangle(),
                        new Circle()
                ))
        ));
        openPicture.draw();
    }
}
