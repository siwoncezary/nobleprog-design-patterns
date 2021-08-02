package revision;

import java.math.BigDecimal;

abstract public class Product {
    private final BigDecimal price;
    private final String name;
    private final String code;

    public Product(BigDecimal price, String name, String code) {
        this.price = price;
        this.name = name;
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public abstract UnitQuantity getUnitQuantity();

    public abstract double getQuantity();
}
