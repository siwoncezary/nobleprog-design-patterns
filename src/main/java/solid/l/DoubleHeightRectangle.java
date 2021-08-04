package solid.l;

public class DoubleHeightRectangle extends  Rectangle{
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width * 2);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height / 2);
    }
}
