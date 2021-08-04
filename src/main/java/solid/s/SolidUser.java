package solid.s;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * Klasa nie narusza zasad SOLID, pole email jest obiektem,
 * który zna szczegóły budowy i zwalnia klasę SolidUser
 * z odpowiedzialności za nią.
 */
@Builder
public class SolidUser {
    @Getter
    private final Email email;
    private String nick;
    public String topDomain(){
        return email.topDomain();
    }
}
