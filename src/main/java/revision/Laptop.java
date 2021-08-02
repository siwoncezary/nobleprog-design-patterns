package revision;

import java.math.BigDecimal;

public class Laptop extends Product{
    private final String brand;
    private final double screenSize;
    private final String cpu;
    private final int ramSize;
    private int usbCount;

    public Laptop(BigDecimal price, String name, String code, String brand, double screenSize, String cpu, int ramSize) {
        super(price, name, code);
        this.brand = brand;
        this.screenSize = screenSize;
        this.cpu = cpu;
        this.ramSize = ramSize;
    }

    public Laptop(BigDecimal price, String name, String code, String brand, double screenSize, String cpu, int ramSize, int usbCount) {
        this(price, name, code, brand, screenSize, cpu, ramSize);
        this.usbCount = usbCount;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    @Override
    public UnitQuantity getUnitQuantity() {
        return UnitQuantity.PIECE;
    }

    @Override
    public double getQuantity() {
        return 1;
    }

    public static Builder.RequiredPrice builder(){
        Builder builder = new Builder();
        return price -> {
            builder.price = price;
            return name ->{
                builder.name = name;
                return builder;
            };
        };
    }

    static class Builder{
        //pola obowiązkowe
        private BigDecimal price;
        private String name;
        //pola opcjonalne
        private String code;
        private String brand;
        private double screenSize;
        private String cpu;
        private int ramSize;
        private int usbCount;

        //interfejs wymuszający podanie parametru price i zwraca obiekt z jedną metoda name
        interface RequiredPrice{
            RequiredName price(BigDecimal price);
        }

        //interfejs wymuszający podanie parametru name i zwraca obiekt budowniczego
        interface RequiredName{
            Builder name(String name);
        }

        private Builder(){
        }

        public Builder code(String code){
            this.code = code;
            return this;
        }

        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        //dopisać metody do pozostałych pól


        public Laptop build(){
            return new Laptop(price, name, code, brand, screenSize, cpu, ramSize, usbCount);
        }
    }
}
