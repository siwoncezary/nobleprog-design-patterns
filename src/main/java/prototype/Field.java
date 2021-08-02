package prototype;

import lombok.Builder;
import lombok.Data;
//interfejs do klonowania w Java jest zbędny, w klasie Object jest metoda clone()
@Builder
@Data
public class Field implements Prototype<Field>{
    private char symbol;
    private int color;

    @Override
    public Field clone() {
        return Field.builder()
                .color(color)
                .symbol(symbol)
                .build();
    }
}
