package solid.o;

import java.util.List;

public class OpenPicture implements Drawable{
    private final List<Drawable> shapes;

    public OpenPicture(List<Drawable> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for(Drawable shape: shapes){
            shape.draw();
        }
    }
}
