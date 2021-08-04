package solid.i;

public class SegregationPrinter implements Printerable{
    @Override
    public void powerOn() {
        System.out.println("ON");
    }

    @Override
    public void powerOff() {
        System.out.println("OFF");
    }

    @Override
    public void print() {
        System.out.println("PRINT");
    }
}
