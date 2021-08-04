package solid.s;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Email {
    @Getter
    private final String email;

    public String topDomain(){
        return email.substring(email.lastIndexOf(".") + 1);
    }
}
