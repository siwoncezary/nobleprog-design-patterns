package builder;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class User {
    private String name;
    private LocalDate birth;
    private String email;
}
