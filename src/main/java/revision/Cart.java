package revision;

import java.util.Map;

public interface Cart {
    void add(Product product, double quantity);
    void remove(Product product);
    Map<Product, Double> content();
}
