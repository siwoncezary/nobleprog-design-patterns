package revision;

import java.math.BigDecimal;

public class ShopApp {
    public static void main(String[] args) {
        Laptop sony = new Laptop(
                new BigDecimal(2000),
                "Sony Vaio",
                "ABC1234",
                "SONY",
                15.6,
                "i7",
                16
        );
        //Budowanie obiektu z użyciem budowniczego
        Laptop lenovo = Laptop.builder()
                .price(new BigDecimal("3000"))
                .name("Lenovo 15.6 X")
                .brand("Lenovo")
                .code("ABC5684")
                .build();
        Tomato tomato = new Tomato(
                new BigDecimal(5),
                "Pomidorki koktajlowe",
                "CDF345",
                true,
                0.5
        );
        Cart cart = new MapCart();
        cart.add(sony,1);
        cart.add(tomato, 1);
        cart.add(tomato,2);
        System.out.println(cart.content());
    }
}
