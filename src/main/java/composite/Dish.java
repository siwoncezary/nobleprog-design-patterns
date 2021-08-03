package composite;

import java.util.List;

public class Dish implements Ingredient{
    private final List<Ingredient> ingredients;

    public Dish(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double calories() {
        //tradycyjna wersja
        double sum = 0;
        for(Ingredient i: ingredients){
            sum += i.calories();
        }
        //z użyciem strumieni
        return ingredients.stream()
                .map(Ingredient::calories)
                .reduce(0d,Double::sum);
    }

    @Override
    public double weight() {
        double sum = 0;
        for(Ingredient i: ingredients){
            sum += i.weight();
        }
        return sum;
    }
}
