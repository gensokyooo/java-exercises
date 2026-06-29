package examExercises;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class NormalUser implements User {
    private String nome;
    private String cognome;
    private Set <User> amici;


    public NormalUser (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.amici = new HashSet<>();

    }

    public void addFriend (User x) {
        if (this == x) {
            throw new SocialNetworkException("yes");
        }

        amici.add(x);

    }

    void follow (PremiumUser x) {


    }

    @Override
    public String getUsername() {
        return username;
    }
}
