package solid.s;

import lombok.Data;

/**
 * Klasa narusza zasadę pojedynczej odpowiednialności
 */
@Data
public class User {
    private String email;
    private String nick;
    //ta metoda narusza zasadę pojedynczej odpowiedzialności!!!
    //W innych klasach, które posiadałyby email, też
    //musielibyśmy powtarzać ten sam kod
    //budowa emaila nie jest zależna do klasy User!!!
    public String topDomain(){
        return email.substring(email.lastIndexOf(".") + 1);
    }
}
