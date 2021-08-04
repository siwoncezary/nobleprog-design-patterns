package solid.i;
/*
Dla klasy Printer interfejs Copier jest zbyt szeroki
Nie można zaimplementować metod copy i scan, bo
klas nie ma takich funkcji
 */
public class Printer implements Copier{
    @Override
    public void powerOn() {
        System.out.println("ON");
    }

    @Override
    public void powerOff() {
        System.out.println("OFF");
    }

    @Override
    public void copy(int copiesNumber) {

    }

    @Override
    public void print() {
        System.out.println("PRINT");
    }

    @Override
    public void scan() {

    }
}
