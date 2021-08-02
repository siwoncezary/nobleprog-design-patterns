package revision;

import java.util.HashMap;
import java.util.Map;

public class MapCart implements Cart{
    private Map<Product, Double> items = new HashMap<>();

    @Override
    public void add(Product product, double quantity) {
        //z wykorzystanie metod funkcyjnych
        items.computeIfPresent(product, (key, oldValue) -> oldValue + quantity);
        items.putIfAbsent(product, quantity);

        //tradycyjny kod bez metod funkcyjnych
//        if (items.containsKey(product)){
//            double oldQuantity  = items.get(product);
//            items.put(product, oldQuantity + quantity);
//        } else{
//            items.put(product, quantity);
//        }

    }

    @Override
    public void remove(Product product) {
        items.remove(product);
    }

    @Override
    public Map<Product, Double> content() {
        return items;
    }
}
