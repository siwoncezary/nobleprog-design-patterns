package revision;

import java.util.*;
import java.util.stream.Collectors;

public class ListCart implements Cart{

    class CartItem{
        Product product;
        double quantity;

        public CartItem(Product product, double quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    private final List<CartItem> items;

    public ListCart(List<CartItem> items) {
        this.items = items;
    }

    @Override
    public void add(Product product, double quantity) {
        items.add(new CartItem(product, quantity));
    }

    @Override
    public void remove(Product product) {
        items.remove(product);
    }

    @Override
    public Map<Product, Double> content() {
        //tradycyjna metoda grupowania
        Set<Product> products = new HashSet<>();
        //dodajemy poe product do zbioru, aby otrzymać listę produktów bez powtórzeń
        for(CartItem item: items){
            products.add(item.product);
        }
        //mapa z wynikami
        Map<Product, Double> result = new HashMap<>();
        //dla każdego produktu zliczamy sumę pól quantity w elementach koszyka
        for(Product product: products){
            double sum = 0;
            for(CartItem item: items){
                if (item.product.equals(product)){
                    sum += item.quantity;
                }
            }
            result.put(product, sum);
        }
        //return result
        return items.stream()
                .collect(
                        Collectors.groupingBy(item -> item.product, //po który polu grupujemy elementy koszyka -> po product
                        Collectors.summingDouble(item -> item.quantity) //co robimy z elementami w grupie -> sumujemy quantity
                        ));
    }
}
