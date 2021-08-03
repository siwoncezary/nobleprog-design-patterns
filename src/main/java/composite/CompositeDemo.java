package composite;

import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Bread bread = Bread.builder()
                .weight(200)
                .caloriesPerUnit(50)
                .name("żytni")
                .build();
        Ingredient cheese = new Ingredient() {
            @Override
            public double calories() {
                return 50 * 100;
            }

            @Override
            public double weight() {
                return 50;
            }
        };
        Dish dinner = new Dish(List.of(bread, cheese));
        System.out.println("Kaloryczność dania: " + dinner.calories());
        System.out.println("Masa dania: " + dinner.weight());

    }
}
