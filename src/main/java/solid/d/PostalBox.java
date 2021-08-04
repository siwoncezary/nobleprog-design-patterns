package solid.d;

enum PostalBox {
    BOX_A(80), BOX_B(190), BOX_C(410);
    private final double deep;
    private static final double WIDTH = 380;
    private static final double HEIGHT = 640;

    PostalBox(double deep) {
        this.deep = deep;
    }

    public boolean isValid(Dimesion dimesion) {
        return deep >= dimesion.deep()
                && WIDTH >= dimesion.width()
                && HEIGHT >= dimesion.height();
    }
}
