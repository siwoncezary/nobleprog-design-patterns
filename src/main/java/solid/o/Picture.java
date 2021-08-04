package solid.o;

import java.util.List;

public class Picture {
    private final List shapes;

    public Picture(List shapes) {
        this.shapes = shapes;
    }

    public void draw(){
        for(Object obj: shapes){
            if (obj instanceof Rectangle){
                Rectangle rectangle = (Rectangle) obj;
                rectangle.draw();
            }
            if (obj instanceof Section){
                Section section = (Section) obj;
                section.draw();
            }
        }
    }
}
