package solid.i;

public class SuperCopier implements SegregationCopier{
    private Printerable printerable;
    private Scanner scanner;
    @Override
    public void powerOn() {
        printerable.powerOn();
        scanner.powerOn();
    }

    @Override
    public void powerOff() {
        printerable.powerOff();
        scanner.powerOff();
    }

    @Override
    public void scan() {
        scanner.scan();
    }

    @Override
    public void print() {
        printerable.print();
    }

    @Override
    public void copy(int copyNumber) {
        scan();
        for(int i = 0; i < copyNumber; i++){
            print();
        }
    }
}
