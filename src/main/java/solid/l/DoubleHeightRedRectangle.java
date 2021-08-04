package solid.l;
/*
Jesli taka dziwna klasa jest potrzebna to nie używajmy jej w dziedziczeniu!!!
 */
public class DoubleHeightRedRectangle {
    private static final int RED = 0xFF0000;
    private double side;

    public DoubleHeightRedRectangle(double side){
        this.side = side;
    }

    public void draw(){
        System.out.println("Color " + RED);
        System.out.println("Height " + side * 2);
        System.out.println("Width " + side);
    }

    public void setSide(double side){
        this.side = side;
    }
}
