package composite;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Bread implements Ingredient{
    //waga w gramach
    private double weight;
    //kaloryczność 100g
    private double caloriesPerUnit;
    private String name;

    @Override
    public double calories() {
        return weight * caloriesPerUnit / 100.0;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
