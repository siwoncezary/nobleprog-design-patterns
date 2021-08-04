package solid.d;

public class Book implements Dimesion{
    private String title;

    @Override
    public double deep() {
        return 20;
    }

    @Override
    public double width() {
        return 210;
    }

    @Override
    public double height() {
        return 297;
    }
}
